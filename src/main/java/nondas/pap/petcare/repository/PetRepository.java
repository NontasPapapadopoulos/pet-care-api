package nondas.pap.petcare.repository;


import nondas.pap.petcare.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

    @Query(value = "SELECT * from pet where user_id = ?1", nativeQuery = true)
    public List<Pet> getPetsByOwnerId(int ownerId);

}
