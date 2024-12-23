package com.shida.springCourseWebServices.config;

import com.shida.springCourseWebServices.entities.User;
import com.shida.springCourseWebServices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Marcello Shibata", "marcello@gmail.com", "977777772", "sahTeAmo");
        User u2 = new User(null, "Sabrina Neves", "sabrina@gmail.com", "977777777", "celloTeAmo");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
