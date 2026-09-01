package edu.utp.saasprompts.dtos;

// DTO usado al hacer un POST para crear un nuevo lienzo
public class ProyectoRequestDTO {
    private String nombreProyecto;
    private String descripcion;
    private Long usuarioId;

    public ProyectoRequestDTO() {
    }

    // Getters y Setters
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}