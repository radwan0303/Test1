package com.example.demo.car;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    private final CarRepo carRepo;

    public List<CarModel> findAll() {return carRepo.findAll();}

    public CarModel save(CarModel carModel) {
        return carRepo.save(carModel);
    }
    public CarModel delete(Long id){
        carRepo.deleteById(id);
        return null;
    }

    public CarModel update(CarModel carModel, Long id){
        CarModel existingCar = carRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found" + id));
        existingCar.setModel(carModel.getModel());
        existingCar.setBrand(carModel.getBrand());
        existingCar.setPricePrDay(carModel.getPricePrDay());
        existingCar.setBestDiscount(carModel.getBestDiscount());
        return carRepo.save(existingCar);
    }
}
