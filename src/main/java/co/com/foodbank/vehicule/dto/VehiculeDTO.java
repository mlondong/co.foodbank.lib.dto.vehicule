package co.com.foodbank.vehicule.dto;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 18/05/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculeDTO {

    @Size(min = 3, max = 10, message = "Complete the brand.")
    public String brand;

    @Size(min = 3, max = 6, message = "Complete the car plate.")
    public String carPLate;

    // @ValidateVolume
    @Pattern(regexp = "^[0-9]{1,3}$",
            message = "Only numbers 0 to 9 in capacity")
    public String capacity;

    @Valid
    public VolumeDTO volume;



}
