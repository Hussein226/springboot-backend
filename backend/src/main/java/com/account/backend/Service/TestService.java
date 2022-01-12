package com.account.backend.Service;

import com.account.backend.Repository.UserRepository;
import com.account.backend.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Service
@AllArgsConstructor
public class TestService {


    UserRepository userRepository;

    public String firstMethod() {
        return "Hello World!";
    }

    public String setUserData(User requestBody){
        User user = User.builder()
                .firstName(requestBody.getFirstName())
                .lastName(requestBody.getLastName())
                .age(requestBody.getAge())
                .gender(requestBody.getGender())
                .build();

        userRepository.save(user);
        return "200";
    }

}
