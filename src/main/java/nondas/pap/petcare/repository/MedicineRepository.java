package nondas.pap.petcare.repository;


import nondas.pap.petcare.entity.Medicine;
import nondas.pap.petcare.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

    @Query(value = "SELECT * FROM medicine where pet_id = ?1", nativeQuery = true)
    List<Medicine> findAllByPetId(int petId);
}
