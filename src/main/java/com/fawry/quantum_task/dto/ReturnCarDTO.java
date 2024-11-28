package com.fawry.quantum_task.dto;

import com.fawry.quantum_task.enummration.EngType;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ReturnCarDTO {
    private int id;
    private int modelYear;
    private EngType engineType;
    private LocalDateTime time;


}
