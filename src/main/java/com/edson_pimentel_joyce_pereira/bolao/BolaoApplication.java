package com.edson_pimentel_joyce_pereira.bolao;

import com.edson_pimentel_joyce_pereira.bolao.controller.LoginController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({LoginController.class})
public class BolaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BolaoApplication.class, args);
    }

}
