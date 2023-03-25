package Part_1;

public class PizzaHutBuilder implements PizzaBuilder{
    private Pizza pizza;

    public PizzaHutBuilder(){
        this.pizza = new Pizza();
        this.pizza.setPizza_chain("Pizza Hut");
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
        Pizza new_pizza = new Pizza();
        new_pizza.setPizza_chain(this.pizza.getPizza_chain());
        new_pizza.check_size(this.pizza.getPizzaSize());
        new_pizza.setPizzaSize(this.pizza.getPizzaSize());
        new_pizza.check_toppings(this.pizza.getPizza_toppings());
        new_pizza.setPizzaToppings(this.pizza.getPizza_toppings());
        return new_pizza;
    }
}
