package br.com.demo.model.controller;

import br.com.demo.model.Car;
import br.com.demo.model.CarRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @Project govnetrh
 * Criado por @author Vinny Parker
 * em 23/09/2019
 */

@RestController
public class CarController {
    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cool-cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Car> coolCars(){
        return carRepository.findAll().stream().filter(this::isCool).collect(Collectors.toList());
    }

    private boolean isCool(Car car) {
        return !car.getNome().equals("AMC Gremlin") &&
                !car.getNome().equals("Triumph Stag") &&
                !car.getNome().equals("Ford Pinto") &&
                !car.getNome().equals("Yugo GV");
    }
}
