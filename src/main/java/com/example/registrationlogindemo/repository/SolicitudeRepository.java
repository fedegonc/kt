package com.example.registrationlogindemo.repository;

import com.example.registrationlogindemo.entity.Solicitude;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// Interfaz de repositorio para la entidad Solicitude que extiende JpaRepository
public interface SolicitudeRepository extends JpaRepository<Solicitude, Integer> {
    // Método para buscar todas las solicitudes por su ID
    void findAllById(int id);

    // Método para buscar solicitudes por categoría que coincida con el texto proporcionado
    List<Solicitude> findSolicitudeByCategoriaLike(String descripcion);

    // Método para buscar solicitudes por nombre que coincida con el texto proporcionado
    List<Solicitude> findSolicitudeByNombreLike(String empresa);

    // Método para buscar solicitudes por estado activo o inactivo
    List<Solicitude> findSolicitudeByActivo(String estado);

    @Transactional
    @Modifying
    @Query("DELETE FROM Solicitude s WHERE s.id = :id")
    void deleteSolicitudeById(@Param("id") Long id);
}
