public class TestPizzaBuilder {
    public static void main(String[] args) {
        PizzaBuilder pizza_hut_builder_1 = new PizzaHutBuilder();
        PizzaBuilder pizza_hut_builder_2 = new PizzaHutBuilder();
        PizzaBuilder little_ceasars_builder_1 = new LittleCeasarsBuilder();
        PizzaBuilder little_ceasars_builder_2 = new LittleCeasarsBuilder();
        PizzaBuilder dominos_builder_1 = new DomniosBuilder();
        PizzaBuilder dominos_builder_2 = new DomniosBuilder();


        PizzaDirector pizza_hut_director_1 = new PizzaDirector(pizza_hut_builder_1);
        PizzaDirector pizza_hut_director_2 = new PizzaDirector(pizza_hut_builder_2);
        PizzaDirector little_caesars_director_1 = new PizzaDirector((little_ceasars_builder_1));
        PizzaDirector little_caesars_director_2 = new PizzaDirector((little_ceasars_builder_2));
        PizzaDirector dominos_director_1 = new PizzaDirector(dominos_builder_1);
        PizzaDirector dominos_director_2 = new PizzaDirector(dominos_builder_2);


        pizza_hut_director_1.makePizza("Large", new String[]{"Pepperoni", "Sausage", "Mushrooms"});
        pizza_hut_director_2.makePizza("Small", new String[]{"Pepperoni", "Sausage"});
        little_caesars_director_1.makePizza("Medium", new String[]{"Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers", "Chicken"});
        little_caesars_director_2.makePizza("Medium", new String[]{"Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese"});
        dominos_director_1.makePizza("Small", new String[]{"Pepperoni"});
        dominos_director_2.makePizza("Large", new String[]{"Pepperoni", "Sausage", "Mushrooms"});



        Pizza pizza_hut_pizza_1 = pizza_hut_director_1.getPizza();
        Pizza pizza_hut_pizza_2 = pizza_hut_director_2.getPizza();
        Pizza little_caesars_pizza_1 = little_caesars_director_1.getPizza();
        Pizza little_caesars_pizza_2 = little_caesars_director_2.getPizza();
        Pizza dominos_pizza_1 = dominos_director_1.getPizza();
        Pizza dominos_pizza_2 = dominos_director_2.getPizza();

        pizza_hut_pizza_1.eat();
        pizza_hut_pizza_2.eat();
        little_caesars_pizza_1.eat();
        little_caesars_pizza_2.eat();
        dominos_pizza_1.eat();
        dominos_pizza_2.eat();
    }
}
