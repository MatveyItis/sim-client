package ru.itis.meltskov.haskell.sim.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameState {

    private Integer result;

    private List<PlayerDto> players;

    private List<GameLine> gameLines;

    private Integer move;

    private Boolean triangle;
}
