package org.grjug.bootlab;

import org.grjug.bootlab.domain.Mission;
import org.grjug.bootlab.domain.MissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Bean
    public CommandLineRunner demo(MissionRepository repository) {
        return (args) -> {
            repository.save(new Mission("Apollo 11", "Manned"));
            repository.save(new Mission("GPS II-F1", "Navigation"));
            repository.save(new Mission("TDRS-K", "Communication"));

            System.out.println("Missions found with findAll():");
            System.out.println("-------------------------------");
            for (Mission mission : repository.findAll()) {
                System.out.println(mission.toString());
            }
            System.out.println("");
        };
    }
}
