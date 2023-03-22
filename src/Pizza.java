public class Pizza implements PizzaPlan{
    private String pizza_size;
    private String pizza_toppings;

    @Override
    public void setPizzaSize(String size) {
        pizza_size = size;
    }

    public String getPizzaSize(){
        return pizza_size;
    }

    @Override
    public void setPizzaToppings(String toppings) {
        pizza_toppings = toppings;
    }

    public String getPizza_toppings(){
        return pizza_toppings;
    }
}
