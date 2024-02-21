package nondas.pap.petcare.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer medicineId;

    private MedicineType medicine;

    private Date dateGranted;

    private String frequency;

//    @ManyToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "pet_id")
//    private Pet pet;


}
