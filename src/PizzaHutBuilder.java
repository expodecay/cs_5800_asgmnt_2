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
        pizza.setPizzaSize(size);
    }

    @Override
    public void build_pizza_toppings(String[] toppings) {
        pizza.setPizzaToppings(toppings);

        for(int i=0; i<toppings.length; i++){
            if(toppings[i].isEmpty()){
                throw new RuntimeException("Topping cannot contain an empty string.");
            }else if(!pizza.getPossible_toppings().contains(toppings[i])){
                throw new RuntimeException(("The selected topping " + "'" + toppings[i]+ "'" + " is not available."));
            }
        }
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
