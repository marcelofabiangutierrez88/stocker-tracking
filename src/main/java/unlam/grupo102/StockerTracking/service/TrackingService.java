package unlam.grupo102.StockerTracking.service;

import com.mongodb.MongoWriteException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import unlam.grupo102.StockerTracking.models.pojo.Venta;
import unlam.grupo102.StockerTracking.models.response.ErrorRest;
import unlam.grupo102.StockerTracking.models.response.StockerVentaResponse;
import unlam.grupo102.StockerTracking.repository.StockerTrackingRepository;

import java.util.Optional;

@Service
public class TrackingService {
    @Value("${uri.stocker.backend.pedido}")
    private String uriBackend;

    @Value("${uri.stocker.stocker.store.id.venta}")
    private String uriStockerStore;
    @Autowired
    private StockerTrackingRepository repository;

    private Venta ventaResponse;

    private StockerVentaResponse response = new StockerVentaResponse();

    private RestTemplate restTemplate = new RestTemplate();

    private Logger logger = LoggerFactory.getLogger(TrackingService.class);
    public ResponseEntity<?> ventaByIdService(String idVenta) {

        String uri = uriStockerStore + idVenta;

        ResponseEntity responseEntity;

        ventaResponse = restTemplate.getForObject(
                uri,
                Venta.class);

        //Todo aramar objeto tracking con metodos


        if(ventaResponse != null) {
            try {
                Optional<Venta> find = repository.findById(ventaResponse.getId());
                if (find.isPresent()) {
                    responseEntity = ResponseEntity.ok().body(find);
                    logger.info("Error ID: "+ find.get().getId() +" Repetido");
                } else {
                    repository.insert(ventaResponse);
                    responseEntity = ResponseEntity.ok().body(ventaResponse);
                    logger.info("Inserto el ID: "+ find.get().getId() +" correctamente");
                }
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
}
