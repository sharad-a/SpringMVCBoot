package com.example.SpringMVCBoot.repo;

import com.example.SpringMVCBoot.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

// DAO layer

public interface AlienRepo extends JpaRepository<Alien, Integer> {
}
