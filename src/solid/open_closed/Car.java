package solid.open_closed;

public class Car extends Vehicle {
    private double fuel;

    public Car(String model, String plate, double engine, double fuel) {
        super(model, plate, engine);
        this.fuel = fuel;
    }

    @Override
    public void drive() {
        if (this.fuel < 2.5) {
            System.out.println("Gasolina Insuficiente");
        } else {
            System.out.println(this.getModel() + " : " + this.getPlate() + " : " + this.getEngine() + " está dirigindo");
        }
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
