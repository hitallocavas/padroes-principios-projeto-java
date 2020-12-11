package solid.open_closed;

public class OpenClosedTest {
    public static void main(String[] args) {
        Vehicle vehicle0 = new Car("Onix", "ABC1234", 2.0, 3.4);
        Vehicle vehicle1 = new Car("Colbalt", "TBQ3443", 1.0, 1.5);
        Vehicle vehicle2 = new Motorcycle("Shineray", "NFG5443", 1.0, 2);
        Vehicle vehicle3 = new Motorcycle("Honda", "JDS3235", 2.5, 0);

        vehicle0.drive();
        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();
    }
}
