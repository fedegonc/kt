package com.example.registrationlogindemo.service;

import com.example.registrationlogindemo.entity.Solicitude;

import java.util.List;

public interface SolicitudeService {

    // Método para encontrar todas las solicitudes
    List<Solicitude> findAll();

    // Método para encontrar una solicitud por su ID
    Solicitude findById(int id);

    // Método para guardar una solicitud
    Solicitude save(Solicitude solicitude);

    // Método para encontrar solicitudes por categoría similar
    List<Solicitude> findSolicitudeByCategoriaLike(String descripcion);

    // Método para encontrar solicitudes por nombre de empresa similar
    List<Solicitude> findSolicitudeByEmpresaLike(String nombre);

    // Método para encontrar solicitudes activas
    List<Solicitude> findSolicitudeActivos();
}
