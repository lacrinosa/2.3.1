package web.service;


import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl {

    private final List<Car> cars = Arrays.asList(
            new Car("Honda", "N-wgn", 2017),
            new Car("Subaru", "Levorg", 2021),
            new Car("Honda", "Stepwgn", 2021),
            new Car("Honda", "Prelude", 2025),
            new Car("Audi", "RS7", 2018)
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
