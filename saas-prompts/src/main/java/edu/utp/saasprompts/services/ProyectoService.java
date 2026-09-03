package edu.utp.saasprompts.services;

import edu.utp.saasprompts.dtos.LienzoResponseDTO;
import edu.utp.saasprompts.dtos.ProyectoRequestDTO;
import edu.utp.saasprompts.dtos.ProyectoResponseDTO;

import java.util.List;

public interface ProyectoService {

    ProyectoResponseDTO crearProyecto(ProyectoRequestDTO proyectoRequestDTO);

    ProyectoResponseDTO obtenerProyecto(Long id);

    List<ProyectoResponseDTO> listarProyectos();

    LienzoResponseDTO obtenerLienzo(Long proyectoId);
}
