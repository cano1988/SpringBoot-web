package com.andres.curso.springboot.webapp.springboot_web.Controllers;


import com.andres.curso.springboot.webapp.springboot_web.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class UserController {


    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Andres","Cano", "juanchito@gmail.com");
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }


    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
                new User("Andres", "cano","ana@gmail.com"),
                new User("Juan", "Alonso", "anaga@gmail.com"),
                new User("Ruben", "Medina","atka@gmail.com"),
                new User("Alejo", "Lopera")

        );
        model.addAttribute("users",users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }


    /*@GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = new ArrayList<>();  //Modo usando un Arraylist
        model.addAttribute("users", users);
        model.addAttribute("title","Listado de usuarios!");
        return "list";
    }*/
}
