package unlam.grupo102.StockerTracking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import unlam.grupo102.StockerTracking.models.response.StockerVentaResponse;
import unlam.grupo102.StockerTracking.service.TrackingService;


@RestController
public class StockerTrackingController {
    private Logger logger = LoggerFactory.getLogger(StockerTrackingController.class);
    @Autowired
    private TrackingService trackingService;
    @GetMapping(value = "${endpoint.stocker.tracking}", consumes = {"application/json"})
    public ResponseEntity<?> getVentaById(@RequestParam String idVenta){
        logger.info("Controller getVentaById(@RequestParam "+ idVenta +" - start");
        StockerVentaResponse response = trackingService.ventaByIdService(idVenta);
        logger.info("Controller getVentaById whit response: "+ response +" - end");
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
