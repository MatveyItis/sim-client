package ru.itis.meltskov.haskell.sim.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameLine {

    private Integer[] connection;

    private String colorForLine;
}
