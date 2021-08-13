package co.com.foodbank.vehicule.dto;

import co.com.foodbank.vehicule.dto.interfaces.IVehicule;
import co.com.foodbank.vehicule.dto.interfaces.IVolume;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 16/05/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule implements IVehicule {

    public String id;
    public String brand;
    public String carPLate;
    public String capacity;
    public IVolume volume;


    @Override
    public String getId() {
        return id;
    }


    @Override
    public String getBrand() {
        return brand;
    }


    @Override
    public String getCarPLate() {
        return carPLate;
    }


    @Override
    public String getCapacity() {
        return capacity;
    }


    @Override
    public IVolume getVolume() {
        return volume;
    }

}
