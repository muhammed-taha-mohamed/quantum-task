package com.fawry.quantum_task.service;

import com.fawry.quantum_task.dto.CreateCarDTO;
import com.fawry.quantum_task.dto.ReturnCarDTO;
import com.fawry.quantum_task.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService {
    ReturnCarDTO createCateCar (CreateCarDTO createCarDTO);

    List<ReturnCarDTO> getAll ();

    String startCar ();

}
