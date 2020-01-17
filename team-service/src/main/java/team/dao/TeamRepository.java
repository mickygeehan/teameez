package team.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import team.model.Team;

public interface TeamRepository extends MongoRepository<Team, String> {
}
