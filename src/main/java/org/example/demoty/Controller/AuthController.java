package org.example.demoty.Controller;

import lombok.RequiredArgsConstructor;
import org.example.demoty.Entity.UserEntity;
import org.example.demoty.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/registration")
public class AuthController {
    private final UserService userService;
    @GetMapping
    String registerForm(){return "registration";}
    @PostMapping
    String registerUser(UserEntity user){userService.registerForm(user);
    return "redirect:/login";}
}
