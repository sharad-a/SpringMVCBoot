package com.example.SpringMVCBoot.repo;

import com.example.SpringMVCBoot.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// DAO layer

public interface AlienRepo extends JpaRepository<Alien, Integer> {

    // Query DSL
    // findBy - is common then your attribute name (first letter must capital) - OrderBy (Spring Boot feature) - Desc/Asc

    // List<Alien> findByAname(String name);
     List<Alien> findByAnameOrderByAidDesc(String name);


    // custom Query
/*    @Query("form alien where aname= :name")
    List<Alien> finda(@Param("name") String aname);*/
}
