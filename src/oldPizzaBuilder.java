public class oldPizzaBuilder implements PizzaBuilder{
    private Pizza pizza;

    public oldPizzaBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void build_pizza_size(String size) {
        pizza.setPizzaSize(size);
    }

    @Override
    public void build_pizza_toppings(String[] toppings) {
        pizza.setPizzaToppings(toppings);
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}