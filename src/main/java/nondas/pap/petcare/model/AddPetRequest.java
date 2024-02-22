package nondas.pap.petcare.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nondas.pap.petcare.model.enums.Gender;
import nondas.pap.petcare.model.enums.PetType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddPetRequest {

    private int petId;
    private String name;
    private PetType type;
    private String dob;
    private Gender gender;
    private int age;
    private int ownerId;


}
