package co.com.foodbank.vehicule.dto;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 16/05/2021
 */
public class Volume implements IVolume {


    public String high;
    public String wide;
    public String longitud;

    public Volume() {}


    public Volume(String high, String wide, String longitud) {
        this.high = high;
        this.wide = wide;
        this.longitud = longitud;
    }

    @Override
    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    @Override
    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

    @Override
    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }


    @Override
    public String toString() {
        return "Volume [high=" + high + ", wide=" + wide + ", longitud="
                + longitud + "]";
    };



}
