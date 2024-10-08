package nondas.pap.petcare.service;


import lombok.RequiredArgsConstructor;
import nondas.pap.petcare.config.JwtService;
import nondas.pap.petcare.exception.EmailAlreadyExists;
import nondas.pap.petcare.model.AuthenticationRequest;
import nondas.pap.petcare.model.AuthenticationResponse;
import nondas.pap.petcare.model.RegisterRequest;
import nondas.pap.petcare.entity.User;
import nondas.pap.petcare.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(RegisterRequest request) throws Exception {
        var user = User.builder()
                .email(request.getEmail())
                .name(request.getName())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

        if (!userRepository.findByEmail(request.getEmail()).isEmpty())
            throw new EmailAlreadyExists("Email already exists");

        userRepository.save(user);

        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse
                .builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.getEmail(),
//                        request.getPassword()
//                )
//        );
        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + request.getEmail()));

        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse
                .builder()
                .token(jwtToken)
                .build();
    }

//    public AuthenticationResponse authenticate(AuthenticationRequest request) {
//        var auth = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.getEmail(),
//                        request.getPassword()
//                )
//        );
//
//        var claims = new HashMap<String, Object>();
//        var user = ((User) auth.getPrincipal());
//        claims.put("fullName", user.getFullName());
//
//        var jwtToken = jwtService.generateToken(claims, (User) auth.getPrincipal());
//        return AuthenticationResponse.builder()
//                .token(jwtToken)
//                .build();
//    }
}
