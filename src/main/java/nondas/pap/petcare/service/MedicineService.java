package nondas.pap.petcare.service;


import lombok.RequiredArgsConstructor;
import nondas.pap.petcare.entity.Medicine;
import nondas.pap.petcare.model.AddMedicineRequest;
import nondas.pap.petcare.repository.MedicineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicineService {


    private final MedicineRepository repository;


    public List<Medicine> getMedicines(int petId) {
        return repository.findAllByPetId(petId);
    }


    public void addMedicine(Medicine medicine) {
        repository.save(medicine);
    }


    public void ediMedicine(Medicine medicine) {
        repository.save(medicine);
    }

    public void deleteMedicine(Medicine medicine) {
        repository.delete(medicine);
    }

}
