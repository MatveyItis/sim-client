package ru.itis.meltskov.haskell.sim.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {

    private Integer numb;

    private String color;

    private List<GameLine> coloredLines;
}
