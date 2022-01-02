package si.exam.monitor.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import si.exam.monitor.Model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {
}
