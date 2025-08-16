package com.tnsif.OneToOneMapping.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.OneToOneMapping.entity.Profile;


public interface ProfileRepository extends JpaRepository<Profile, Long> {
}