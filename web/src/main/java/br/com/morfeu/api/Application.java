package br.com.morfeu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by cmaia on 14/04/16
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"br.com.morfeu.api.controller", "br.com.morfeu.api.service"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
