package nondas.pap.petcare.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer petId;

    private String name;

    private String dob;

    private String type;

    private String gender;


//    @ManyToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "user_id")
//    private User owner;
//
//
//    @OneToMany(mappedBy = "pet")
//    private List<Medicine> medicines;

}
