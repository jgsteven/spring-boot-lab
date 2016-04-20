package org.grjug.bootlab;

import org.grjug.bootlab.domain.Launch;
import org.grjug.bootlab.domain.LaunchRepository;
import org.grjug.bootlab.domain.LaunchStatus;
import org.grjug.bootlab.domain.Mission;
import org.grjug.bootlab.domain.MissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(MissionRepository missionRepository, LaunchRepository launchRepository) {
        return (args) -> {
            missionRepository.save(new Mission("Apollo 11", "Manned"));
            missionRepository.save(new Mission("GPS II-F1", "Navigation"));
            missionRepository.save(new Mission("TDRS-K", "Communication"));

            System.out.println("");
            System.out.println("Missions found with findAll():");
            missionRepository.findAll().forEach(System.out::println);

            launchRepository.save(new Launch("XM-3", LaunchStatus.SUCCESS));
            launchRepository.save(new Launch("GOES-N", LaunchStatus.SUCCESS));
            launchRepository.save(new Launch("NSS-8", LaunchStatus.FAILED));

            System.out.println("");
            System.out.println("Successful Launches:");
            launchRepository.findByStatus(LaunchStatus.SUCCESS)
                    .forEach(System.out::println);
            
            System.out.println("");
            System.out.println("Failed Launches:");
            launchRepository.findByStatus(LaunchStatus.FAILED)
                    .forEach(System.out::println);
            
            System.out.println("");
        };
    }
}
