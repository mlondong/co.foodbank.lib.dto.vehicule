package co.com.foodbank.vehicule.dto.interfaces;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import co.com.foodbank.vehicule.dto.Volume;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 16/05/2021
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({@Type(value = Volume.class, name = "Volume")})
public interface IVolume {

    public String getHigh();

    public String getWide();

    public String getLongitud();
}
