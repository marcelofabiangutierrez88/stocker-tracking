package unlam.grupo102.StockerTracking.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import unlam.grupo102.StockerTracking.models.response.StockerStoreResponse;
import unlam.grupo102.StockerTracking.models.db.Producto;
import unlam.grupo102.StockerTracking.models.db.StockerTracking;
import unlam.grupo102.StockerTracking.models.response.ErrorRest;
import unlam.grupo102.StockerTracking.repository.StockerTrackingRepository;

import java.util.*;

@RestController
public class StockerTrackingController {

    @Value("${endpoint.stocker.tracking}")
    private String endpoint;
    private RestTemplate restTemplate = new RestTemplate();

    @Value("${uri.stocker.stocker.store.id.venta}")
    private String uriBackend;
    private Logger logger = LoggerFactory.getLogger(StockerTrackingController.class);

    @Autowired
    private StockerTrackingRepository repository;

    @GetMapping(value = "/getPedido/{idVenta}")
    public ResponseEntity<?> getPedidosById(@PathVariable String idVenta) {
        StockerStoreResponse responseBackend = new StockerStoreResponse();
        ResponseEntity entity;
        String uri = uriBackend + idVenta;

        try {
            String jsonResponse = restTemplate.getForObject(uri, String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            responseBackend = objectMapper.readValue(jsonResponse, StockerStoreResponse.class);

            StockerTracking stockerTracking = setForDBTracking(responseBackend);

            Optional find = repository.findById(stockerTracking.getId());

            if (find.isPresent()) {
                entity = ResponseEntity.ok().body(find);
            } else {
                repository.save(stockerTracking);
                entity = ResponseEntity.ok().body(stockerTracking);
            }

        } catch (Exception e) {
            ErrorRest errorRest = new ErrorRest()
                    .setCode("500")
                    .setDescription(formatErrorMessage(e.getMessage()));
            responseBackend.setErrorRest(errorRest);
            entity = ResponseEntity.internalServerError().body(errorRest);
        }
        return entity;
    }

    private String formatErrorMessage(String error) {
        if (StringUtils.hasText(error)) {
            String recoverError = error.split(":")[3];
            return recoverError;
        } else {
            return "No se pudo parsear el mensaje de error";
        }
    }

    private StockerTracking setForDBTracking(StockerStoreResponse resp) {

        List<Producto> productoList = new ArrayList<>();
        StockerTracking stockerTracking = new StockerTracking()
                .setId(resp.get_id())
                .setApellidoCliente(resp.getIdUsuario().getApellido())
                .setNombreCliente(resp.getIdUsuario().getNombre())
                .setMetodoEntrega(generateRandomDeliveryMethod())
                .setFechaEntrega("15/11/2022");
        for (int i = 0; i < resp.getDetalle().size(); i++) {
            Producto producto = new Producto();

            producto.setNombreProducto(resp.getDetalle().get(i).getIdProducto().getNombre());
            producto.setDescripcionProducto(resp.getDetalle().get(i).getIdProducto().getDescripcion());
            producto.setCantidad(resp.getDetalle().get(i).getCantidad());
            producto.setPrecio(resp.getDetalle().get(0).getPrecio());

            productoList.add(producto);

            stockerTracking.setProductoList(productoList);
        }

        return stockerTracking;
    }

    private String generateRandomDeliveryMethod() {
        List<String> randomDeliviery = Arrays.asList("Envio Privado", "Mensajeria", "Correo Argentino");

        Random random = new Random();
        int randomItem = random.nextInt(randomDeliviery.size());
        String randomDeliveryMethod = randomDeliviery.get(randomItem);

        return randomDeliveryMethod;
    }

}
