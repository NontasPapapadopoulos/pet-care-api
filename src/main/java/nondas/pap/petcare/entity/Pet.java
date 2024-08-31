package nondas.pap.petcare.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nondas.pap.petcare.model.enums.Gender;
import nondas.pap.petcare.model.enums.PetType;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer petId;
    private String name;
    private String dob;
    private PetType type;
    private Gender gender;


    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(mappedBy = "pet")
    private List<Medicine> medicines;

}
