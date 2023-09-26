import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {


    @PostMapping("/login")
    public void login(String email, String password) {

    }

    @PostMapping("/register")
    public void register(String email, String password) {

    }






}
