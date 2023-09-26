package com.application.service.user;

import com.application.entity.user.User;
import com.application.entity.user.UserRole;
import com.application.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {


    private final TokenService  tokenService;

    private final UserRepository userRepository;

    public String getUserByToken(String bearerToken){
        String cleanToken = bearerToken.split(" ")[1];

        return userRepository.findByLogin(tokenService.validateToken(cleanToken)).getUsername();
    }
}
