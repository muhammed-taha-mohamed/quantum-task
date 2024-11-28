package com.fawry.quantum_task.model;

import com.fawry.quantum_task.enummration.EngType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Car {
    private int id;
    private int modelYear;
    private EngType engineType;

}
