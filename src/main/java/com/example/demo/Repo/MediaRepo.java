package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Media;

@Repository
public interface MediaRepo extends JpaRepository<Media, Long>{

}
