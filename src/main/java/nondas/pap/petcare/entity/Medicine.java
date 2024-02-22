package nondas.pap.petcare.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nondas.pap.petcare.model.enums.MedicineType;
import nondas.pap.petcare.model.enums.RepeatRate;

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

    private MedicineType medicineType;
    private RepeatRate repeatRate;
    private String dateReceived;
    private String comments;
    private int petId;

//    @ManyToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "pet_id")
//    private Pet pet;


}
