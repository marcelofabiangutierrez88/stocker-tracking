package unlam.grupo102.StockerTracking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import unlam.grupo102.StockerTracking.models.db.StockerTracking;
import unlam.grupo102.StockerTracking.models.pojo.Venta;

public interface StockerTrackingRepository extends MongoRepository<Venta, String> {

    @Override
    Venta insert(Venta v);

}
