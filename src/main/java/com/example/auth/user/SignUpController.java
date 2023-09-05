package com.example.auth.user;

import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/signup")
public class SignUpController {
    public final UserService userService;

    @GetMapping
    public String signup() { return "signup";  }

    @PostMapping
    public String signup(@ModelAttribute UserRegisterDto userDto) {
        userService.signup(userDto.username(), userDto.password());
        return "redirect:login";
    }
}
