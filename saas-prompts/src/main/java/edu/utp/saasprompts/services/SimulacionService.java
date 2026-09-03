package edu.utp.saasprompts.services;

import edu.utp.saasprompts.dtos.SimulacionRequestDTO;
import edu.utp.saasprompts.dtos.SimulacionTokenDTO;

public interface SimulacionService {

    SimulacionTokenDTO ejecutarSimulacion(Long proyectoId, SimulacionRequestDTO simulacionRequestDTO);
}
