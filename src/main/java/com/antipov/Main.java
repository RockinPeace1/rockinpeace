package com.antipov;
import com.antipov.Car;
import com.antipov.CarService;


public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Car car1 = carService.create();
        Car car2 = carService.create();
        Car car3 = carService.create();
        CarService.print(car1);
        CarService.print(car2);
        CarService.print(car3);
    }
}

