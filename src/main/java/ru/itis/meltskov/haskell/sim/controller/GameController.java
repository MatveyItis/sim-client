package ru.itis.meltskov.haskell.sim.controller;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.meltskov.haskell.sim.service.SimFeignService;

@Controller
@RequiredArgsConstructor
public class GameController {

    private final SimFeignService simFeignService;

    @GetMapping("/game")
    public String createGame() {
        UUID gameId = simFeignService.createGame();
        return "redirect:/game/" + gameId.toString();
    }

    @GetMapping("/game/{gameId}")
    public ModelAndView getGame(@PathVariable UUID gameId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("game");
        modelAndView.addObject("state", simFeignService.getGameState(gameId));
        return modelAndView;
    }
}
