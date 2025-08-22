package com.java.domain.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
  
  Optional<UserEntity> findByEmailAndUseYn(String email, char useYn);
  UserEntity findByEmail(String email);

}
