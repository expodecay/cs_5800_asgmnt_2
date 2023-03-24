package Part_1;

public class PizzaDirector {

    public PizzaBuilder pizzaBuilder;

    public PizzaDirector (PizzaBuilder pizzaaBuilder){
        this.pizzaBuilder = pizzaaBuilder;
    }

    public Pizza getPizza(){
        return this.pizzaBuilder.getPizza();
    }

    public void makePizza(String size, String[] toppings){
        this.pizzaBuilder.build_pizza_size(size);
        this.pizzaBuilder.build_pizza_toppings(toppings);
    }
}
