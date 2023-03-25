package Part_2;

public class Car implements Vehicle {
   protected String vehicle_type = "car";

    @Override
    public String vehicle_info() {
        return vehicle_type;
    }
}
