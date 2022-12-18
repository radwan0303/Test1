package com.example.demo.car;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
@CrossOrigin
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    private List<CarModel> findAll() {return carService.findAll();}

    @PostMapping
    public CarModel save(@RequestBody CarModel carModel) { return carService.save(carModel);}

    @DeleteMapping("/{id}")
    public CarModel delete(@PathVariable Long id) {
        return carService.delete(id);
    }

    @PatchMapping("/{id}")
    public CarModel update(@RequestBody CarModel carModel, @PathVariable Long id) {return carService.update(carModel, id);}

}
