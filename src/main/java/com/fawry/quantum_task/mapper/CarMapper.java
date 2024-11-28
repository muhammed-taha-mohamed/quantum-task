package com.fawry.quantum_task.mapper;

import com.fawry.quantum_task.dto.CreateCarDTO;
import com.fawry.quantum_task.dto.ReturnCarDTO;
import com.fawry.quantum_task.model.Car;
import lombok.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Service
public class CarMapper {

    public Car toModel (CreateCarDTO createCarDTO){
        return Car.builder()
                .engineType(createCarDTO.getEngineType())
                .modelYear(createCarDTO.getModelYear())
                .id(123)
                .build();
    }


    public ReturnCarDTO toResponseDto (Car car) {
        return ReturnCarDTO.builder()
                .modelYear(car.getModelYear())
                .id(car.getId())
                .engineType(car.getEngineType())
                .time(LocalDateTime.now())
                .build();
    }

    public List<ReturnCarDTO> toResponseList (List<Car> carList){
        return carList
                .stream().map(this::toResponseDto).toList();
    }


}
