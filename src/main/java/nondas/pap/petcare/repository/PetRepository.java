package nondas.pap.petcare.repository;


import nondas.pap.petcare.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

    public List<Pet> getPetsById(String userId);
}
