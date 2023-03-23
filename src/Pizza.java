import java.util.ArrayList;
import java.util.Arrays;

public class Pizza implements PizzaPlan{
    private String pizza_chain;
    private String pizza_size;
    private String[] pizza_toppings;

    private ArrayList<String> possible_toppings = new ArrayList<String>(
            Arrays.asList("Pepperoni",
                    "Sausage",
                    "Mushrooms",
                    "Bacon",
                    "Onions",
                    "Extra Cheese",
                    "Peppers",
                    "Chicken",
                    "Olives",
                    "Spinach",
                    "Tomato and Basil",
                    "Beef",
                    "Ham",
                    "Pesto",
                    "Spicy Pork",
                    "Ham and Pineapple"));

    @Override
    public void setPizzaSize(String size) {
        pizza_size = size;
    }

    public String getPizzaSize(){
        return pizza_size;
    }

    @Override
    public void setPizzaToppings(String[] toppings) {
        pizza_toppings = toppings;
    }

    public String[] getPizza_toppings(){
        return pizza_toppings;
    }

    public ArrayList<String> getPossible_toppings(){
        return possible_toppings;
    }

    public void setPizza_chain(String pizza_chain) {
        this.pizza_chain = pizza_chain;
    }

    public String getPizza_chain() {
        return pizza_chain;
    }

    public void eat(){
        System.out.println("chain: " + getPizza_chain());
        System.out.println("Size: " + getPizzaSize());
        System.out.print("Toppings: ");

        for(int i=0; i<getPizza_toppings().length; i++){
            System.out.print(getPizza_toppings()[i] + " ");
        }
        System.out.println("");
        System.out.println("---------------------------------------");
    }
}
