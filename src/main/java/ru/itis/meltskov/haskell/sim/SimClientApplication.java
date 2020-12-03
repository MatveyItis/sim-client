package ru.itis.meltskov.haskell.sim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.itis.meltskov.haskell.sim.config.SimServerProperties;

@SpringBootApplication
@EnableConfigurationProperties(SimServerProperties.class)
public class SimClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimClientApplication.class);
    }
}
