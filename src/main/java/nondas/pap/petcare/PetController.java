package nondas.pap.petcare;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pets")
public class PetController {


    @GetMapping("/all")
    public void getPets(String user) {

    }













}
