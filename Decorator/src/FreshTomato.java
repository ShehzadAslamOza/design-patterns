public class FreshTomato extends ToppingsDecorator{

    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

   public String getDescription() {
        return pizza.getDescription() + ", FreshTomato";
    }

    @Override
    public int getCost() {
        return 20 + pizza.getCost();
    }
}
