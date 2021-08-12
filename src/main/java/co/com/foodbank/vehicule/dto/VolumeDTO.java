package co.com.foodbank.vehicule.dto;

import co.com.foodbank.validaton.ValidateVolume;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 18/05/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VolumeDTO {

    @ValidateVolume
    public String high;

    @ValidateVolume
    public String wide;

    @ValidateVolume
    public String longitud;


}
