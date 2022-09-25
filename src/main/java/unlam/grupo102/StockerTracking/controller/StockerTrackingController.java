package unlam.grupo102.StockerTracking.controller;

import com.mongodb.MongoWriteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import unlam.grupo102.StockerTracking.models.pojo.Venta;
import unlam.grupo102.StockerTracking.models.response.ErrorRest;
import unlam.grupo102.StockerTracking.models.response.StockerVentaResponse;
import unlam.grupo102.StockerTracking.repository.StockerTrackingRepository;

import java.text.ParseException;


@RestController
public class StockerTrackingController {

    @Value("${uri.stocker.backend.pedido}")
    private String uriBackend;

    @Value("${uri.stocker.stocker.store.id.venta}")
    private String uriStockerStore;
    @Autowired
    private StockerTrackingRepository repository;

    private Venta ventaResponse;

    private StockerVentaResponse response = new StockerVentaResponse();

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping(value = "${endpoint.stocker.tracking}", consumes = {"application/json"})
    public StockerVentaResponse getVentaById(@RequestParam String idVenta){

        String uri = uriStockerStore + idVenta;

        ventaResponse = restTemplate.getForObject(
                uri,
                Venta.class);

        if(ventaResponse != null) {
            try {
                repository.insert(ventaResponse);
                response.setOk(true);
                response.setVenta(ventaResponse);
                response.setTotal( ventaResponse.getTotalVenta()+"");
            }catch (MongoWriteException err){
                ErrorRest errorRest = new ErrorRest();
                errorRest.setCode(err.getLocalizedMessage());
                errorRest.setDescription(err.getMessage());
                response.setError(errorRest);
            }
        }

        return response;
    }


//    public ResponseEntity<StockerPedidoResponse> getPedidosById(@PathVariable String idPedido) {
//        StockerPedidoResponse responseBackend = new StockerPedidoResponse();
//        ResponseEntity entity;
//        String uri = uriBackend + idPedido;
//
//        try {
//            String jsonResponse = restTemplate.getForObject(uri, String.class);
//
//            ObjectMapper objectMapper = new ObjectMapper();
//            responseBackend = objectMapper.readValue(jsonResponse, StockerPedidoResponse.class);
//
////            StockerTracking stockerTracking = setForDBTracking(responseBackend);
//
//            Optional find = repository.findById(stockerTracking.getId());
//
//            if (find.isPresent()) {
//                entity = ResponseEntity.ok().body(find);
//            } else {
//                repository.save(stockerTracking);
//                entity = ResponseEntity.ok().body(stockerTracking);
//            }
//
//        } catch (Exception e) {
//            ErrorRest errorRest = new ErrorRest()
//                    .setCode("500")
//                    .setDescription(formatErrorMessage(e.getMessage()));
//            responseBackend.setError(errorRest);
//            entity = ResponseEntity.internalServerError().body(errorRest);
//        }
//        return entity;
//    }
//
//    private String formatErrorMessage(String error) {
//        if (StringUtils.hasText(error)) {
//            String recoverError = error.split(":")[3];
//            return recoverError;
//        } else {
//            return "No se pudo parsear el mensaje de error";
//        }
//    }
//
////    private StockerTracking setForDBTracking(StockerPedidoResponse resp) {
////        StockerTracking stockerTracking = new StockerTracking()
////                .setId(resp.getPedido().get_id())
////                .setApellidoCliente(resp.getPedido().getCliente().getApellido())
////                .setNombreCliente(resp.getPedido().getCliente().getNombre())
////                .setDireccion(resp.getPedido().getCliente().getDireccion())
////                .setNombreProducto(resp.getPedido().getProducto().getNombre())
////                .setDescProducto(resp.getPedido().getProducto().getDescripcion())
////                .setMetodoEntrega(generateRandomDeliveryMethod())
////                .setFechaEntrega("15/11/2022");
////
////        return stockerTracking;
////    }
//
//    private String generateRandomDeliveryMethod() {
//        List<String> randomDeliviery = Arrays.asList("Envio Privado", "Mensajeria", "Correo Argentino");
//
//        Random random = new Random();
//        int randomItem = random.nextInt(randomDeliviery.size());
//        String randomDeliveryMethod = randomDeliviery.get(randomItem);
//
//        return randomDeliveryMethod;
//    }

}
