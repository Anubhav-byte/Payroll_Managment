package com.example.payroll;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner intitDatabase(EmployeeRepository repository){
        return args -> {
            log.info("Preload " + repository.save(new Employee("Anubhav", "Purohit",
                    "Programmer")));
            log.info("Preloaad " + repository.save(new Employee("Mark", "Zukerberg",
                    "Theif")));
        };
    }
}
