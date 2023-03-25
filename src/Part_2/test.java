package Part_2;

public class test {
    public static void main(String[] args) {
        AbstractFactory honda_factory = VehicleProducer.getFactory("Car", "Honda"); // wrong string will cause nullPoointerException
        AbstractFactory porsche_factory = VehicleProducer.getFactory("Car", "Porsche");
        AbstractFactory tesla_factory = VehicleProducer.getFactory("Car", "Tesla");

        AbstractFactory airbus_factory = VehicleProducer.getFactory("Plane", "Airbus");
        AbstractFactory boeing_factory = VehicleProducer.getFactory("Plane", "Boeing");
        AbstractFactory embraer_factory = VehicleProducer.getFactory("Plane", "Embraer");

        AbstractFactory tesla_factory_2 = VehicleProducer.getFactory("Car", "Tesla");
        AbstractFactory airbus_factory_2 = VehicleProducer.getFactory("Plane", "Airbus");

        AbstractFactory searay_factory = VehicleProducer.getFactory("Boat", "SeaRay");
        AbstractFactory mastercraft_factory = VehicleProducer.getFactory("Boat", "Mastercraft");
        AbstractFactory bertram_factory = VehicleProducer.getFactory("Boat", "Bertram");

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

        System.out.println("\n.......................");
        airbus_factory.build_vehicle();
        airbus_factory.repair_vehicle();
        airbus_factory.restore_vehicle();
        System.out.println();
        boeing_factory.build_vehicle();
        boeing_factory.repair_vehicle();
        boeing_factory.restore_vehicle();
        System.out.println();
        embraer_factory.build_vehicle();
        embraer_factory.repair_vehicle();
        embraer_factory.restore_vehicle();

        System.out.println("\nSecond Tesla factory:");
        tesla_factory_2.build_vehicle();
        System.out.println("\nSecond Airbus factory:");
        airbus_factory_2.build_vehicle();

        System.out.println("\n.......................");
        searay_factory.build_vehicle();
        searay_factory.repair_vehicle();
        searay_factory.restore_vehicle();
        System.out.println();
        mastercraft_factory.build_vehicle();
        mastercraft_factory.repair_vehicle();
        mastercraft_factory.restore_vehicle();
        System.out.println();
        bertram_factory.build_vehicle();
        bertram_factory.repair_vehicle();
        bertram_factory.restore_vehicle();
    }
}
