package unlam.grupo102.StockerTracking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import unlam.grupo102.StockerTracking.models.db.StockerTracking;

public interface StockerTrackingRepository extends MongoRepository<StockerTracking, String> {
}
