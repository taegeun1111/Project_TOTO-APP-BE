package com.example.todo.userapi.service;

import com.example.todo.userapi.dto.request.UserRequestSingUpDTO;
import com.example.todo.userapi.dto.response.UserSignUpResponseDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(false)
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    @DisplayName("중복된 이메일로 회원가입을 시도하면" +
            " RuntimeException이 발생해야 한다.")
    void saveTest(){

        //given
        String email = "abcew1234@abc.com";

        UserRequestSingUpDTO dto = UserRequestSingUpDTO.builder()
                .email(email)
                .password("qefq")
                .userName("werf")
                .build();
        //then
        assertThrows(RuntimeException.class,
                () -> {userService.create(dto);}
        );
    }
}