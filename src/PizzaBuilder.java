public interface PizzaBuilder {
    void build_pizza_chain(String chain);
    public void build_pizza_size(String size);

    public void build_pizza_toppings(String[] toppings);

    public Pizza getPizza();


}
