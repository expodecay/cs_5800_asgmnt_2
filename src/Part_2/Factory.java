package Part_2;

public interface Factory extends Build, Repair, Restore{

    void print_factory_name();

    @Override
    void build_vehicle();

    @Override
    void repair_vehicle();

    @Override
    void restore_vehicle();

    Vehicle get_vehicle();
}
