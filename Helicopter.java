package helicopter;

public class Helicopter {
    public int quantityOfPassengers;
    public String name;
    public double maxSpeed;

    private double length;
    private double weight;

    private static String producingCountry;

    protected int numberOfBlades;
    protected int volumeOfTank;

    public Helicopter(){
        producingCountry = "Ukraine";
    };

    public Helicopter(int quantityOfPassengers, String name, double maxSpeed, double length) {
        this.quantityOfPassengers = quantityOfPassengers;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.length = length;
    }

    public Helicopter(int quantityOfPassengers, String name, double maxSpeed, double length, double weight,
                      int numberOfBlades, int volumeOfTank) {
        this(quantityOfPassengers, name, maxSpeed, length);
        this.weight = weight;
        this.numberOfBlades = numberOfBlades;
        this.volumeOfTank = volumeOfTank;
    }

    public String toString(){
        return quantityOfPassengers + " - quantity of passengers, " + name + " - name, " + maxSpeed + " - max speed, " +
                length + " - length, " + weight + " - weight, " + numberOfBlades + " - numberOfBlades, " + volumeOfTank + " - volume of tank.";
    }

    static void printStaticProducingCountry(){
        System.out.println(producingCountry + " is producing country");
    }

    public void printProducingCountry(){
        System.out.println(producingCountry + " is producing country");
    }

    public void resetValues(int quantityOfPassengers, String name, double maxSpeed, double length, double weight,
                            int numberOfBlades, int volumeOfTank){
        this.quantityOfPassengers = quantityOfPassengers;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.length = length;
        this.weight = weight;
        this.numberOfBlades = numberOfBlades;
        this.volumeOfTank = volumeOfTank;
    }

    public int getQuantityOfPassengers() {
        return quantityOfPassengers;
    }

    public void setQuantityOfPassengers(int quantityOfPassengers) {
        this.quantityOfPassengers = quantityOfPassengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setMass(double weight) {
        this.weight = weight;
    }

}
