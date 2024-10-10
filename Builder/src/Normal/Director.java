package Normal;

public class Director {

    public void SportsCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine());
    }

    public void Truck(Builder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(3);
        builder.setEngine(new Engine());
    }

    public void Bus(Builder builder) {
        builder.setCarType(CarType.BUS);
        builder.setSeats(50);
        builder.setEngine(new Engine());
    }
}
