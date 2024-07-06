package com.example.registrationlogindemo.repository;

import com.example.registrationlogindemo.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Integer> {
    List<Image> findAll();
    Optional<Image> findById(Long id);

    void deleteById(Long Id);
}
