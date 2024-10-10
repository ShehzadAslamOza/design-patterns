package Normal;

public class Client {

    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();

        director.SportsCar(carBuilder);
        Car car = carBuilder.build();
        System.out.println(car);
    }
}
