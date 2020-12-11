package solid.open_closed;

public class Motorcycle extends Vehicle {

    private int helmet;

    public Motorcycle(String model, String plate, double engine, int helmet) {
        super(model, plate, engine);
        this.helmet = helmet;
    }

    @Override
    public void drive() {
        if (this.helmet < 1) {
            System.out.println("Capacetes são obrigatórios");
        } else {
            System.out.println(this.getModel() + " : " + this.getPlate() + " : " + this.getEngine() + " está dirigindo");
        }
    }

}
