public class AlbaikSause extends ToppingsDecorator{

    Pizza pizza;

    public AlbaikSause(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + ", AlbaikSause";
    }

    @Override
    public int getCost() {
        return 5 + pizza.getCost();
    }
}
