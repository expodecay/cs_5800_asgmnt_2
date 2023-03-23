public class PizzaDirector {

    private PizzaBuilder pizzaBuilder;

    public PizzaDirector (PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return this.pizzaBuilder.getPizza();
    }

    public void makePizza(String chain, String size, String[] toppings){

        for(int i=0; i<toppings.length; i++){
            if(!pizzaBuilder.getPizza().getPossible_toppings().contains(toppings[i])){
                System.out.println("We dont have " + toppings[i]);
            }

        }

        this.pizzaBuilder.build_pizza_chain(chain);
        this.pizzaBuilder.build_pizza_size(size);
        this.pizzaBuilder.build_pizza_toppings(toppings);
    }
}
