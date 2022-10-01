package unlam.grupo102.StockerTracking.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import unlam.grupo102.StockerTracking.models.db.StockerTracking;
import unlam.grupo102.StockerTracking.models.pojo.Venta;

import java.util.Optional;

public interface StockerTrackingRepository extends MongoRepository<Venta, String> {

    @Override
    Venta insert(Venta v);

    @Override
    <S extends Venta> Optional<S> findOne(Example<S> example);
}
