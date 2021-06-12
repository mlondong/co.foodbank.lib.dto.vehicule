package co.com.foodbank.vehicule.dto;

import co.com.foodbank.validaton.ValidateVolume;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 18/05/2021
 */
public class VolumeDTO {

    @ValidateVolume
    public String high;

    @ValidateVolume
    public String wide;

    @ValidateVolume
    public String longitud;


    /**
     * Defaultconstructor.
     */
    public VolumeDTO() {}



    /**
     * Constructor with parameters.
     * 
     * @param high
     * @param wide
     * @param longitud
     */
    public VolumeDTO(String high, String wide, String longitud) {
        super();
        this.high = high;
        this.wide = wide;
        this.longitud = longitud;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }



    @Override
    public String toString() {
        return "VolumeDTO [high=" + high + ", wide=" + wide + ", longitud="
                + longitud + "]";
    }



}
