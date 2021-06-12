package co.com.foodbank.vehicule.dto;


/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vehicule.dto 16/05/2021
 */
public class Vehicule implements IVehicule {

    public String id;
    public String brand;
    public String carPLate;
    public String capacity;
    public IVolume volume;

    /**
     * Default constructor.
     */
    public Vehicule() {}



    /**
     * Constructor with parameters
     * 
     * @param brand
     * @param carPLate
     * @param capacity
     * @param volume
     */
    public Vehicule(String brand, String carPLate, String capacity,
            IVolume volume) {
        this.brand = brand;
        this.carPLate = carPLate;
        this.capacity = capacity;
        this.volume = volume;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getCarPLate() {
        return carPLate;
    }

    public void setCarPLate(String carPLate) {
        this.carPLate = carPLate;
    }

    @Override
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public IVolume getVolume() {
        return volume;
    }

    public void setVolume(IVolume volume) {
        this.volume = volume;
    }



    @Override
    public String toString() {
        return "Vehicule [brand=" + brand + ", carPLate=" + carPLate
                + ", capacity=" + capacity + ", volume=" + volume + "]";
    }

}
