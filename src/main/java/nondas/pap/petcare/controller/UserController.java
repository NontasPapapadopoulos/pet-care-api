package nondas.pap.petcare.controller;


import lombok.RequiredArgsConstructor;
import nondas.pap.petcare.Payload;
import nondas.pap.petcare.dto.UserDto;
import nondas.pap.petcare.entity.Pet;
import nondas.pap.petcare.entity.User;
import nondas.pap.petcare.model.AddPetRequest;
import nondas.pap.petcare.service.PetService;
import nondas.pap.petcare.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor()
public class UserController {

    private final UserService service;

    @GetMapping("/")
    public ResponseEntity<Payload> getUser(String email) {

        Payload payload = new Payload(service.getUser(email));

        return ResponseEntity.ok(payload);
    }



}
