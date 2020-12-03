package ru.itis.meltskov.haskell.sim.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "sim-server")
public class SimServerProperties {

    private String host;

    private Urls urls;

    @Data
    @NoArgsConstructor
    public static class Urls {

        private String createGame;

        private String getGameState;
    }
}
