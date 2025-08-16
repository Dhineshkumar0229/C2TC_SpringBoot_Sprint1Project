package com.tnsif.OneToOneMapping.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.OneToOneMapping.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
