public class TestPizzaBuilder {
    public static void main(String[] args) {
        PizzaBuilder pizza_hut = new PizzaHutBuilder();
        PizzaBuilder little_ceasars = new LittleCeasarsBuilder();
        PizzaBuilder dominos = new DomniosBuilder();

        PizzaDirector pizza_hut_director = new PizzaDirector(pizza_hut);
        PizzaDirector little_caesars_director = new PizzaDirector((little_ceasars));

        PizzaDirector dominos_director = new PizzaDirector(dominos);

        pizza_hut_director.makePizza("Large, check size", new String[]{"Pepperoni", "Sausage", "Mushrooms"});
        little_caesars_director.makePizza("Medium, check size", new String[]{"Pepperoni"});
        dominos_director.makePizza("Medium, check size", new String[]{"Pepperoni", "Sausage"});


        Pizza pizza_hut_pizza = pizza_hut_director.getPizza();
        Pizza little_caesars_pizza = little_caesars_director.getPizza();
        Pizza dominos_pizza = dominos_director.getPizza();

        pizza_hut_pizza.eat();
        little_caesars_pizza.eat();
        dominos_pizza.eat();

    }
}
