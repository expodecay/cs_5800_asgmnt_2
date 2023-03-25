package Part_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza implements PizzaPlan{
    private String pizza_chain;
    private String pizza_size;
    private String[] pizza_toppings;

    private final ArrayList<String> possible_sizes = new ArrayList<>(
            Arrays.asList("Small", "Medium", "Large")
    );

    private final ArrayList<String> possible_toppings = new ArrayList<>(
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
                    "Ham and Pineapple")
    );

    public void setPizza_chain(String pizza_chain) {
        this.pizza_chain = pizza_chain;
    }

    public String getPizza_chain() {
        return pizza_chain;
    }

    @Override
    public void setPizzaSize(String size) {
        this.pizza_size = size;
    }

    public String getPizzaSize(){
        return this.pizza_size;
    }

    @Override
    public void setPizzaToppings(String[] toppings) {
        this.pizza_toppings = toppings;
    }


    public String[] getPizza_toppings(){
        return this.pizza_toppings;
    }

    public ArrayList<String> getPossible_toppings(){
        return possible_toppings;
    }

    public ArrayList<String> getPossible_sizes(){
        return possible_sizes;
    }

    public void check_size(String size){
        if(size.isEmpty()){
            throw new RuntimeException("The size of a pizza cannot be empty.");
        }else if(!this.getPossible_sizes().contains(size)){
            throw new RuntimeException(("The selected size " + "'" + size+ "'" + " is not available."));
        }
    }

    public void check_toppings(String[] toppings){
        for (String topping : toppings) {
            if (topping.isEmpty()) {
                throw new RuntimeException("Topping cannot contain an empty string.");
            } else if (!this.getPossible_toppings().contains(topping)) {
                throw new RuntimeException(("The selected topping " + "'" + topping + "'" + " is not available."));
            }
        }
    }

    public void eat(){
        System.out.println("chain: " + getPizza_chain());
        System.out.println("Size: " + getPizzaSize() );
        System.out.print("Toppings: ");

        for(int i=0; i<getPizza_toppings().length; i++){
            System.out.print(getPizza_toppings()[i] + " ");
        }
        System.out.println("");
        System.out.println("---------------------------------------");
    }
}
