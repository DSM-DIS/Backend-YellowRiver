package com.example.auth_dis.Controller;

import com.example.auth_dis.Domain.user.User;
import com.example.auth_dis.paylod.UserInformationResponse;
import com.example.auth_dis.paylod.UserResponse;
import com.example.auth_dis.service.auth.AuthService;
import com.example.auth_dis.service.user.UserService;
import lombok.RequiredArgsConstructor;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(path="/user")
    public void SIGN_IN (@RequestBody @Valid UserResponse user) {
        System.out.println(user);
        userService.SIGN_IN(user);
    }

    @GetMapping(path="/user")
    public UserInformationResponse GET_INFO_BY_ACCESS(HttpServletRequest request) {
        String accessToken = request.getHeader("Authorization");
        System.out.println("accessToken : " + accessToken);
        return userService.GET_INFO_BY_ACCESS(accessToken);
    }

}
