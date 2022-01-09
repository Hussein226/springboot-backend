package com.account.backend.Controller;


import com.account.backend.Service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@AllArgsConstructor
public class TestController {

    TestService testService;

    @GetMapping("/")
    public String index() {
        return testService.firstMethod();
    }

}
