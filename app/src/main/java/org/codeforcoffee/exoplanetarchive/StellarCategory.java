package org.codeforcoffee.exoplanetarchive;

/**
 * Created by codeforcoffee on stellar_cat_7/10/16.
 */
public class StellarCategory {

    private int id;
    private String spectralClass;
    private String name;
    private double minTemp;
    private double maxTemp;
    private String description;


    /***
     *
     * @param spectralClass
     * @param colour
     * @param minTemp
     * @param maxTemp
     * @param desc
     */
    public StellarCategory(int id, String spectralClass, String colour, double minTemp, double maxTemp, String desc) {
        this.id = id;
        this.spectralClass = spectralClass;
        this.name = colour;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.description = desc;
    }

    public int getId() { return id; }

    public String getSpectralClass() {
        return spectralClass;
    }

    public String getName() {
        return name;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "StellarCategory{" +
                "spectralClass=" + spectralClass +
                ", colour='" + name + '\'' +
                ", minTemp=" + minTemp +
                ", maxTemp=" + maxTemp +
                ", description='" + description + '\'' +
                '}';
    }
}
