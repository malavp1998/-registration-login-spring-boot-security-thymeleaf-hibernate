package com.springSecurityLogin.service;

import com.springSecurityLogin.model.User;
import com.springSecurityLogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
