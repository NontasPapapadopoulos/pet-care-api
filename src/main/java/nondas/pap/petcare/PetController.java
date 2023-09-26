package nondas.pap.petcare;


import nondas.pap.petcare.model.Pet;
import nondas.pap.petcare.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/pet")
public class PetController {


    @GetMapping("/all")
    public List<Pet> getPets(String user) {

        return new ArrayList<>();
    }



    @PostMapping("/add")
    public void addPet(Pet pet, User user) {


    }


    @PostMapping("/delete")
    public void deletePet(Pet pet, User user) {


    }

    @PostMapping("/edit")
    public void editPet(Pet pet, User user) {


    }













}
