package ru.itis.meltskov.haskell.sim.service;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.itis.meltskov.haskell.sim.config.SimServerProperties;
import ru.itis.meltskov.haskell.sim.dto.GameState;

@Service
@RequiredArgsConstructor
public class SimFeignService {

    private final RestTemplate restTemplate;

    private final SimServerProperties simServerProperties;

    public UUID createGame() {
        return restTemplate.postForObject(simServerProperties.getHost() + simServerProperties.getUrls().getCreateGame(), null, UUID.class);
    }

    public GameState getGameState(UUID gameId) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("gameId", gameId.toString());
        return restTemplate.exchange(simServerProperties.getHost() + simServerProperties.getUrls().getGetGameState(),
                HttpMethod.GET, new HttpEntity<>(null, headers), GameState.class).getBody();
    }
}
