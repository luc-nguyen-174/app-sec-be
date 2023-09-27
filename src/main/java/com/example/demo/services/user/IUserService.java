package com.example.demo.services.user;

import com.example.demo.models.Users;
import com.example.demo.services.IGeneral;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneral<Users>, UserDetailsService {
    UserDetails loadUserByUsername(String username);
}
