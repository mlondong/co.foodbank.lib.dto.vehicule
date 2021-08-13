package co.com.foodbank.vehicule.dto;

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
public class Volume implements IVolume {


    public String high;
    public String wide;
    public String longitud;


    @Override
    public String getHigh() {
        return high;
    }


    @Override
    public String getWide() {
        return wide;
    }


    @Override
    public String getLongitud() {
        return longitud;
    }



}
