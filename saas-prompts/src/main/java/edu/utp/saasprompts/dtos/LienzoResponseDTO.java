package edu.utp.saasprompts.dtos;

import java.util.List;

public class LienzoResponseDTO {

    private Long proyectoId;
    private List<String> nodos;

    public LienzoResponseDTO() {
    }

    public LienzoResponseDTO(Long proyectoId, List<String> nodos) {
        this.proyectoId = proyectoId;
        this.nodos = nodos;
    }

    public Long getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(Long proyectoId) {
        this.proyectoId = proyectoId;
    }

    public List<String> getNodos() {
        return nodos;
    }

    public void setNodos(List<String> nodos) {
        this.nodos = nodos;
    }
}
