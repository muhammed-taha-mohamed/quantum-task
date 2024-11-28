package com.fawry.quantum_task.service.impl;

import com.fawry.quantum_task.dto.CreateCarDTO;
import com.fawry.quantum_task.dto.ReturnCarDTO;
import com.fawry.quantum_task.mapper.CarMapper;
import com.fawry.quantum_task.model.Car;
import com.fawry.quantum_task.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarMapper carMapper;

    List<Car> carList; // database

    @Override
    public ReturnCarDTO createCateCar(CreateCarDTO createCarDTO) {
        try {
            Car car = carMapper.toModel(createCarDTO);
            carList.add(car);
            return carMapper.toResponseDto(car);

        } catch (Exception e) {
            throw new IllegalArgumentException("Cannot create car !");
        }
    }

    @Override
    public List<ReturnCarDTO> getAll() {
        try {
            return carMapper.toResponseList(carList);
        } catch (Exception e) {
            throw new IllegalArgumentException("Cannot get car list!");
        }
    }


    @Override
    public String startCar() {
        try {
            return "CAR IS SUCCESSFULLY STARTED !";
        } catch (Exception e) {
            throw new IllegalArgumentException("Cannot start!");
        }
    }


}
