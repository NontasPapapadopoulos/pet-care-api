package nondas.pap.petcare.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
public class Medicine {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long medicineId;

    private MedicineType medicine;

    private Date dateGranted;

    private String frequency;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "pet_id")
    private Pet pet;


    public Medicine(Long medicineId, MedicineType medicine, Date dateGranted, String frequency, Pet pet) {
        this.medicineId = medicineId;
        this.medicine = medicine;
        this.dateGranted = dateGranted;
        this.frequency = frequency;
        this.pet = pet;
    }

    public Medicine() {}

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public MedicineType getMedicine() {
        return medicine;
    }

    public void setMedicine(MedicineType medicine) {
        this.medicine = medicine;
    }

    public Date getDateGranted() {
        return dateGranted;
    }

    public void setDateGranted(Date dateGranted) {
        this.dateGranted = dateGranted;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}



enum MedicineType {
    YEARLY_VACCINE,
    LEISHMANIASIS_VACCINE,
    RABIES_VACCINE,
    PILL_FOR_TICKS,
    TICK_FOR_TICKS
}