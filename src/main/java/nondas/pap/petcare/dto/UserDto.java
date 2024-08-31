package nondas.pap.petcare.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nondas.pap.petcare.entity.Pet;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class UserDto {

    private Integer userId;
    private String name;
    private String email;
    private List<Pet> pets;


    public UserDto(Integer userId, String name, String username, List<Pet> pets) {
        this.userId = userId;
        this.name = name;
        this.email = username;
        this.pets = pets;

    }
}
