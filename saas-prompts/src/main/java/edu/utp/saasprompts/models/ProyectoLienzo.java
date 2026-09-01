package edu.utp.saasprompts.models;

public class ProyectoLienzo {
    private Long id;
    private Long usuarioId;
    private String nombreProyecto;
    private String descripcion;
    private String estructuraGrafoJson; // aqui se guardara el json del lienzo visual (Rete.js/ngx-graph)

    public ProyectoLienzo() {
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

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

    public String getEstructuraGrafoJson() {
        return estructuraGrafoJson;
    }

    public void setEstructuraGrafoJson(String estructuraGrafoJson) {
        this.estructuraGrafoJson = estructuraGrafoJson;
    }
}
