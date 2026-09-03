package edu.utp.saasprompts.controllers;

import edu.utp.saasprompts.dtos.LienzoResponseDTO;
import edu.utp.saasprompts.dtos.ProyectoRequestDTO;
import edu.utp.saasprompts.dtos.ProyectoResponseDTO;
import edu.utp.saasprompts.services.ProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @PostMapping
    public ResponseEntity<ProyectoResponseDTO> crearProyecto(@RequestBody ProyectoRequestDTO proyectoRequestDTO) {
        ProyectoResponseDTO creado = proyectoService.crearProyecto(proyectoRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @GetMapping
    public ResponseEntity<List<ProyectoResponseDTO>> listarProyectos() {
        return ResponseEntity.ok(proyectoService.listarProyectos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProyectoResponseDTO> obtenerProyecto(@PathVariable Long id) {
        return ResponseEntity.ok(proyectoService.obtenerProyecto(id));
    }

    @GetMapping("/{id}/lienzo")
    public ResponseEntity<LienzoResponseDTO> obtenerLienzo(@PathVariable Long id) {
        return ResponseEntity.ok(proyectoService.obtenerLienzo(id));
    }
}
