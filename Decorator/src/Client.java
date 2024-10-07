public class Client {

    public static void main(String[] args) {

        // Getting Chicken Tikka Pizza
        Pizza pizza = new ChickenTikka();
        System.out.println(pizza.getDescription() + " -- Cost: " + pizza.getCost());

        // Decorating Pizza with Cheese
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + "-- Cost: " + pizza.getCost());

        // Decorating Pizza with Fresh Tomato
        pizza = new FreshTomato(pizza);
        System.out.println(pizza.getDescription() + "-- Cost: " + pizza.getCost());

        // Decorating Pizza with Albaik Sause
        pizza = new AlbaikSause(pizza);
        System.out.println(pizza.getDescription() + "-- Cost: " + pizza.getCost());

    }

}
