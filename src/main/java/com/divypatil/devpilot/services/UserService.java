package com.divypatil.devpilot.services;

import com.divypatil.devpilot.entity.User;
import com.divypatil.devpilot.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    public final UserRepository userRepository;
    public final TextEncryptor tokenEncryptor;

    @Transactional(readOnly = true)
    public User requiredById(UUID id){
        return userRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("User not found"));
    }

    public String decryptAccessToken(User  user){
        return tokenEncryptor.decrypt(user.getAccessToken());
    }

    private static Long toLong(Object value){
        if(value instanceof Number number){
            return number.longValue();
        }

        return Long.parseLong(String.valueOf(value));
    }

}
