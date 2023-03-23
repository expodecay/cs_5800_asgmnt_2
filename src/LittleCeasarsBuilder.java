public class LittleCeasarsBuilder implements PizzaBuilder{
    private Pizza pizza;

    public LittleCeasarsBuilder(){
        this.pizza = new Pizza();
        this.pizza.setPizza_chain("Little Ceasars");
    }

    public void build_pizza_chain(String chain){
        pizza.setPizza_chain(chain);
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

