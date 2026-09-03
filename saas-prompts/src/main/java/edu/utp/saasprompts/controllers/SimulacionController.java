package edu.utp.saasprompts.controllers;

import edu.utp.saasprompts.dtos.SimulacionRequestDTO;
import edu.utp.saasprompts.dtos.SimulacionTokenDTO;
import edu.utp.saasprompts.services.SimulacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proyectos/{proyectoId}/simulaciones")
public class SimulacionController {

    private final SimulacionService simulacionService;

    public SimulacionController(SimulacionService simulacionService) {
        this.simulacionService = simulacionService;
    }

    @PostMapping
    public ResponseEntity<SimulacionTokenDTO> ejecutarSimulacion(@PathVariable Long proyectoId, @RequestBody SimulacionRequestDTO simulacionRequestDTO) {
        SimulacionTokenDTO resultado = simulacionService.ejecutarSimulacion(proyectoId, simulacionRequestDTO);
        return ResponseEntity.ok(resultado);
    }
}
