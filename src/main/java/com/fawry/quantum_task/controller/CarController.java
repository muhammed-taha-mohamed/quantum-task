package com.fawry.quantum_task.controller;

import com.fawry.quantum_task.dto.CreateCarDTO;
import com.fawry.quantum_task.dto.ReturnCarDTO;
import com.fawry.quantum_task.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {

    private final CarService carService;


    @PostMapping("/create")
    ReturnCarDTO createCar (@RequestBody CreateCarDTO dto){
        return carService.createCateCar(dto);
    }

    @GetMapping("/get-all")
    List<ReturnCarDTO> getAll (){
        return carService.getAll();
    }

    @PostMapping("/start")
    String start (){
        return carService.startCar();
    }
}
