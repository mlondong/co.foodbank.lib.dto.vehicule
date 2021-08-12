package co.com.foodbank.vehicule.interfaces;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 16/05/2021
 */
public interface IVehicule {
    public IVolume getVolume();

    public String getCarPLate();

    public String getCapacity();

    public String getBrand();

    @JsonIgnore(value = true)
    public String getId();
}
