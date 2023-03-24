package Part_1;

public interface PizzaBuilder {
    public void build_pizza_size(String size);

    public void build_pizza_toppings(String[] toppings);

    public Pizza getPizza();


}
