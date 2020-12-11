package solid.open_closed;

public abstract class Vehicle {

    private String model;
    private String plate;
    private double engine;

    public Vehicle(String model, String plate, double engine) {
        this.model = model;
        this.plate = plate;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


    public abstract void drive();


}
