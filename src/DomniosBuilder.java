public class DomniosBuilder implements PizzaBuilder{
    private Pizza pizza;

    public DomniosBuilder(){
        this.pizza = new Pizza();
        this.pizza.setPizza_chain("Dominos");
    }

    public void build_pizza_chain(String chain){
        pizza.setPizza_chain(chain);
    }

    @Override
    public void build_pizza_size(String size) {
        pizza.setPizzaSize(size);
        if(size.isEmpty()){
            throw new RuntimeException("The size of a pizza cannot be empty.");
        }else if(!pizza.getPossible_sizes().contains(size)){
            throw new RuntimeException(("The selected size " + "'" + size+ "'" + " is not available."));
        }
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
