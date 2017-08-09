package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CarDAO {

    Map<Integer, Car> cars = null;

    @PostConstruct
    public void init() {
        cars = new HashMap<>();
        cars.put(1000, new Car(1000, "X5", "BMW", 7884883.88, 89));
        cars.put(2000, new Car(2000, "X5", "BMW", 7884883.88, 89));
        cars.put(3000, new Car(3000, "X5", "BMW", 7884883.88, 89));
        cars.put(4000, new Car(4000, "X5", "BMW", 7884883.88, 89));
        cars.put(5000, new Car(5000, "X5", "BMW", 7884883.88, 89));
        cars.put(6000, new Car(6000, "X5", "BMW", 7884883.88, 89));

    }

    @PreDestroy
    public void clean() {
        cars.clear();
        cars = null;
    }

    public int update(int vin, Car car) {
        cars.put(vin, car);
        return vin;
    }

    public void delete(int vin) {
        cars.remove(vin);
    }

    public int save(Car car) {
        int id = (cars.size()+1)*1000;
        cars.put(id, car);
        return id;
    }

    public Car readByVin(int vin) {
        return cars.get(vin);
    }

    public Collection<Car> selectAll() {
        return cars.values();
    }
}
