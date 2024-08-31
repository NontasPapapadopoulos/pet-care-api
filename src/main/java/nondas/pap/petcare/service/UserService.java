package nondas.pap.petcare.service;


import lombok.RequiredArgsConstructor;
import nondas.pap.petcare.dto.UserDto;
import nondas.pap.petcare.entity.Pet;
import nondas.pap.petcare.entity.User;
import nondas.pap.petcare.model.AddPetRequest;
import nondas.pap.petcare.repository.MedicineRepository;
import nondas.pap.petcare.repository.PetRepository;
import nondas.pap.petcare.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public UserDto getUser(String email) {
        var user =  userRepository.findByEmail(email).orElseThrow();

        return new UserDto(
                user.userId,
                user.getName(),
                user.getUsername(), // this is the email
                user.getPets()
        );

    }


}
