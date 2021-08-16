package co.com.foodbank.vehicule.dto.interfaces;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import co.com.foodbank.vehicule.dto.Vehicule;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 16/05/2021
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({@Type(value = Vehicule.class, name = "Vehicule")})
public interface IVehicule {
    public IVolume getVolume();

    public String getCarPLate();

    public String getCapacity();

    public String getBrand();

    @JsonIgnore(value = true)
    public String getId();
}
