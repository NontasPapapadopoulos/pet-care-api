package nondas.pap.petcare.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long petId;

    private String name;

    private String dob;

    private String type;

    private String gender;


    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "user_id")
    private User owner;


    @OneToMany(mappedBy = "pet")
    private List<Medicine> medicines;


    public Pet(Long petId, String name, String dob, String type, String gender, User owner, List<Medicine> medicines) {
        this.petId = petId;
        this.name = name;
        this.dob = dob;
        this.type = type;
        this.gender = gender;
        this.owner = owner;
        this.medicines = medicines;
    }

    public Pet() {}

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicine(List<Medicine> medicine) {
        this.medicines = medicine;
    }
}
