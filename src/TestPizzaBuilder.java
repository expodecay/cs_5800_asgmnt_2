public class TestPizzaBuilder {
    public static void main(String[] args) {
        PizzaBuilder oldStylePizza = new oldPizzaBuilder();

        PizzaDirector pizzaDirector = new PizzaDirector(oldStylePizza);

        pizzaDirector.makePizza("asdf");

        Pizza first_pizza = pizzaDirector.getPizza();

        System.out.println("Pizza Built");
        System.out.println("Size: " + first_pizza.getPizzaSize());
        System.out.println("Toppings: " + first_pizza.getPizza_toppings());
    }
}
