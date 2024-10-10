package Normal;

public class Car {

    private CarType carType;
    private int seats;
    private Engine engine;

    public Car(CarType carType, int seats, Engine engine) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
    }


    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car [carType=" + carType + ", seats=" + seats + ", engine=" + engine + "]";
    }
}
