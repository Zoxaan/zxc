package org.example.demoty.Service;

import lombok.RequiredArgsConstructor;
import org.example.demoty.Entity.Role;
import org.example.demoty.Entity.UserEntity;
import org.example.demoty.Repo.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@RequiredArgsConstructor
@Service
public class UserService {
private final UserRepo userRepo;
private final PasswordEncoder passwordEncoder;

public void registerForm(UserEntity user){
user.setUsername(user.getUsername());
user.setPassword(passwordEncoder.encode(user.getPassword()));
user.setRoles(Collections.singleton(Role.USER));
userRepo.save(user);
}
}
