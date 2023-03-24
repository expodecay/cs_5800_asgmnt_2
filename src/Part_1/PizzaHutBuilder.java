package Part_1;

public class PizzaHutBuilder implements PizzaBuilder{
    private Pizza pizza;

    public PizzaHutBuilder(){
        this.pizza = new Pizza();
        this.pizza.setPizza_chain("Part_1.Pizza Hut");
    }

    public void build_pizza_chain(String chain){
        pizza.setPizza_chain(chain);
    }

    @Override
    public void build_pizza_size(String size) {
        pizza.check_size(size);
        pizza.setPizzaSize(size);
    }

    @Override
    public void build_pizza_toppings(String[] toppings) {
        pizza.check_toppings(toppings);
        pizza.setPizzaToppings(toppings);
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
