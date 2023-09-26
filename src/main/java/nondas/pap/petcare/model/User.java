package nondas.pap.petcare.model;


import jakarta.persistence.*;
import nondas.pap.petcare.model.Pet;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String name;

    private String email;

    private String password;


    @OneToMany(mappedBy = "user")
    private List<Pet> pets;

    public User(Long userId, String name, String email, String password, List<Pet> pets) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.pets = pets;
    }

    public User() {}

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
