package co.za.eskom.SpringBatch.repository;

import co.za.eskom.SpringBatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
