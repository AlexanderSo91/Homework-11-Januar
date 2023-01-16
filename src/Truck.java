import driver.DriverС;


public class Truck extends Transport<DriverС> {

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverС driverC) {
        super(brand, model, engineVolume, driverC);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки" + getBrand() + "начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Грузовик марки" + getBrand() + "закончил движение");

    }

    @Override
    public void refill() {

    }

    @Override
    public void pitStop() {
        System.out.println("Питстоп");

    }

    @Override
    public void theBestTimeLap() {
        int minBound = 50;
        int maxBound = 100;
        int theBestTimeLap = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Лучшее время круга грузовика" + theBestTimeLap);

    }

    @Override
    public void maxSpeed() {
        int minBound = 60;
        int maxBound = 90;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальная скорость грузовика" + maxSpeed);

    }
}

