package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.klu.entity.Person;

@Repository
public interface personRepository extends JpaRepository<Person,Integer>{
	
     @Query("select name from members m where m.password =:pass and m.name =:nm")
     public String getid(@Param("pass")int pass,@Param("nm") String nm);
}
