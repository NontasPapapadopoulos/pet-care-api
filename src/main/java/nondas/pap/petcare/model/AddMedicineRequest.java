package nondas.pap.petcare.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nondas.pap.petcare.model.enums.MedicineType;
import nondas.pap.petcare.model.enums.RepeatRate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddMedicineRequest {

    private int medicineId;
    private MedicineType medicineType;
    private RepeatRate repeatRate;
    private String dateReceived;
    private String comments;
    private int petId;
}
