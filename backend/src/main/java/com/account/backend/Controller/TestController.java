package com.account.backend.Controller;


import com.account.backend.Service.TestService;
import com.account.backend.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
public class TestController {

    TestService testService;

    @GetMapping("/")
    public String index() {
        return testService.firstMethod();
    }

    @PostMapping("/setUserData")
    public void user_information(@RequestBody User body){
        testService.setUserData(body);
    }
}
