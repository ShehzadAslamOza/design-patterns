public class Cheese extends ToppingsDecorator{

    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public int getCost() {
        return 5 + pizza.getCost();
    }
}
