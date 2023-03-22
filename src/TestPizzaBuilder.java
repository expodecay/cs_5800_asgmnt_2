public class TestPizzaBuilder {
    public static void main(String[] args) {
        PizzaBuilder oldStylePizza = new oldPizzaBuilder();

        PizzaDirector pizzaDirector = new PizzaDirector(oldStylePizza);

        pizzaDirector.makePizza("Medium", new String[]{"Pepperoni", "Sausage", "Mushrooms", "coffee"});

        Pizza first_pizza = pizzaDirector.getPizza();

        System.out.println("Pizza Built");
        System.out.println("Size: " + first_pizza.getPizzaSize());
        //System.out.println("Toppings: " + first_pizza.getPizza_toppings()[0]);
        System.out.print("Toppings: ");

        for(int i=0; i< first_pizza.getPizza_toppings().length; i++){
            System.out.print(first_pizza.getPizza_toppings()[i] + " ");
        }
    }
}
