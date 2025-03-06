package com.jagan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Hello 🤩");
        model.addAttribute("title", "I have successfuly built a sprint boot application");
        model.addAttribute("msg", "This application was built by using maven ");
        model.addAttribute("msg", "By using jenkins pipeline, I have created a docker image and pushed it to docker hub");
        model.addAttribute("msg", "This application is deployed on Docker container");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
