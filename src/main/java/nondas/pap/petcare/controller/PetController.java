package nondas.pap.petcare.controller;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import nondas.pap.petcare.model.AddPetRequest;
import nondas.pap.petcare.entity.Pet;
import nondas.pap.petcare.entity.User;
import nondas.pap.petcare.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/pet")
@RequiredArgsConstructor()
public class PetController {

    private final PetService service;

    @GetMapping("/all")
    public ResponseEntity<List<Pet>> getPets(String userId) {
        return ResponseEntity.ok(service.getPets(userId));
    }

    @PostMapping("/add")
    public void addPet(@RequestBody AddPetRequest addPetRequest) {
        service.addPet(addPetRequest);
    }


    @DeleteMapping("/delete")
    public void deletePet(Pet pet) {
        service.deletePet(pet);
    }

    @PutMapping("/edit")
    public void editPet(Pet pet) {
        service.editPet(pet);
    }

}
