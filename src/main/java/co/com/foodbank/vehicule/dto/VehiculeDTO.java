package co.com.foodbank.vehicule.dto;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 18/05/2021
 */

public class VehiculeDTO {

    @Size(min = 5, max = 10, message = "Complete the brand.")
    public String brand;

    @Size(min = 5, max = 6, message = "Complete the car plate.")
    public String carPLate;

    // @ValidateVolume
    public String capacity;

    @Valid
    public VolumeDTO volume;


    public VehiculeDTO() {}


    public VehiculeDTO(String brand, String carPLate, String capacity,
            VolumeDTO volume) {
        super();
        this.brand = brand;
        this.carPLate = carPLate;
        this.capacity = capacity;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarPLate() {
        return carPLate;
    }

    public void setCarPLate(String carPLate) {
        this.carPLate = carPLate;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public VolumeDTO getVolume() {
        return volume;
    }

    public void setVolume(VolumeDTO volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "VehiculeDTO [brand=" + brand + ", carPLate=" + carPLate
                + ", capacity=" + capacity + ", volume=" + volume + "]";
    }



}
