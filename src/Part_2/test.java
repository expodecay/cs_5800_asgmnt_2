package Part_2;

public class test {
    public static void main(String[] args) {
        AbstractFactory honda_factory = VehicleProducer.getFactory("Car", "Honda"); // wrong string will cause nullPoointerException
        AbstractFactory porsche_factory = VehicleProducer.getFactory("Car", "Porsche");
        AbstractFactory tesla_factory = VehicleProducer.getFactory("Car", "Tesla");

        AbstractFactory tesla_factory_2 = VehicleProducer.getFactory("Car", "Tesla");

        honda_factory.build_vehicle();
        honda_factory.repair_vehicle();;
        honda_factory.restore_vehicle();
        System.out.println();
        porsche_factory.build_vehicle();
        porsche_factory.repair_vehicle();
        porsche_factory.restore_vehicle();
        System.out.println();
        tesla_factory.build_vehicle();
        tesla_factory.repair_vehicle();
        tesla_factory.restore_vehicle();

        System.out.println("\nSecond tesla factory:");
        tesla_factory_2.build_vehicle();
    }
}
