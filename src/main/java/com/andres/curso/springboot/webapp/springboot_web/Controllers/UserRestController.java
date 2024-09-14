package com.andres.curso.springboot.webapp.springboot_web.Controllers;


import com.andres.curso.springboot.webapp.springboot_web.Models.User;
import com.andres.curso.springboot.webapp.springboot_web.Models.dto.UserDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/api")//Ruta por defecto a los controladores
public class UserRestController {


    @GetMapping("/details")
    public UserDto details(){
        User user = new User("Andres","Cano","milito@gmail.com");
        UserDto userDto = new UserDto();
        userDto.setUser(user.getName());
        userDto.setLastname(user.getLastname());
        userDto.setTitle("Hola mundo Spring boot");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Andrés","Cano");
        User user2 = new User("Juan","Cano");
        User user3 = new User("Beto","Cano");

        List<User> users = Arrays.asList(user,user2,user3); //Una manera y para retornar puede ser directamente desde Arrays

//        List<User> users = new ArrayList<>(); // Segunda manera
//        users.add(user);
//        users.add(user2);
//        users.add(user3);

        return users;

    }


    // Metodo con Map
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Andres","Cano");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring Bootu");
        body.put("user", user);
        return body;
    }
}
