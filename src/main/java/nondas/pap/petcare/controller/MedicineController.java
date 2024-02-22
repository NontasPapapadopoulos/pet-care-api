package nondas.pap.petcare.controller;


import lombok.RequiredArgsConstructor;
import nondas.pap.petcare.entity.Medicine;
import nondas.pap.petcare.entity.Pet;
import nondas.pap.petcare.model.AddMedicineRequest;
import nondas.pap.petcare.model.AddPetRequest;
import nondas.pap.petcare.service.MedicineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/medicine")
@RequiredArgsConstructor
public class MedicineController {

    private final MedicineService service;


    @GetMapping("/all")
    public ResponseEntity<List<Medicine>> getMedicines(int petId) {
        return ResponseEntity.ok(service.getMedicines(petId));
    }

    @PostMapping("/add")
    public void addMedicine(@RequestBody Medicine medicine) {
        service.addMedicine(medicine);
    }


    @DeleteMapping("/delete")
    public void deleteMedicine(Medicine medicine) {
        service.deleteMedicine(medicine);
    }

    @PutMapping("/edit")
    public void editMedicine(Medicine medicine) {
        service.ediMedicine(medicine);
    }

}
