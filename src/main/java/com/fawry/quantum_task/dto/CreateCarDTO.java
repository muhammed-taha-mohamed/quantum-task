package com.fawry.quantum_task.dto;

import com.fawry.quantum_task.enummration.EngType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CreateCarDTO {
    private int modelYear;
    private EngType engineType;

}
