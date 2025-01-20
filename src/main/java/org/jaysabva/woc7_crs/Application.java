package org.jaysabva.woc7_crs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.jaysabva.woc7_crs")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
