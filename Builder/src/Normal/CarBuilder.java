package Normal;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car build() {
        return new Car(carType, seats, engine);
    }

}
