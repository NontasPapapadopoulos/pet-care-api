package nondas.pap.petcare.repository;

import nondas.pap.petcare.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //@Query(value = "SELECT * from user where email = ?1", nativeQuery = true)
    Optional<User> findByEmail(String email);

    //@Query(value = "SELECT * from user where user_id = ?1", nativeQuery = true)
    User findById(int id);

}
