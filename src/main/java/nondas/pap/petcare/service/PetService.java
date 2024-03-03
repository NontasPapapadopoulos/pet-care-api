package nondas.pap.petcare.service;


import lombok.RequiredArgsConstructor;
import nondas.pap.petcare.model.AddPetRequest;
import nondas.pap.petcare.entity.Pet;
import nondas.pap.petcare.repository.PetRepository;
import nondas.pap.petcare.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepository petRepository;

    private final UserRepository userRepository;


    public List<Pet> getPets(String userId) {
        return null;
    }

    public void addPet(AddPetRequest addPetRequest) {
        Pet pet = Pet.builder()
                .name(addPetRequest.getName())
                .dob(addPetRequest.getDob())
                .gender(addPetRequest.getGender())
                .type(addPetRequest.getType())
                .user(userRepository.findById(addPetRequest.getOwnerId()))
                .build();
        petRepository.save(pet);
    }

    public void editPet(Pet pet) {
        petRepository.save(pet);
    }

    public void deletePet(Pet pet) {
        petRepository.delete(pet);
    }

}
