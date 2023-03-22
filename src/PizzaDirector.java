public class PizzaDirector {

    private PizzaBuilder pizzaBuilder;

    public PizzaDirector (PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return this.pizzaBuilder.getPizza();
    }

    public void makePizza(String size, String[] toppings){
        this.pizzaBuilder.build_pizza_size(size);
        this.pizzaBuilder.build_pizza_toppings(toppings);
    }
}
