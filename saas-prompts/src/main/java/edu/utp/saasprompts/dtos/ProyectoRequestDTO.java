package edu.utp.saasprompts.dtos;

public class ProyectoRequestDTO {

    private String nombre;
    private String descripcion;
    private Long presupuestoMensualTokens;

    public ProyectoRequestDTO() {
    }

    public ProyectoRequestDTO(String nombre, String descripcion, Long presupuestoMensualTokens) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.presupuestoMensualTokens = presupuestoMensualTokens;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPresupuestoMensualTokens() {
        return presupuestoMensualTokens;
    }

    public void setPresupuestoMensualTokens(Long presupuestoMensualTokens) {
        this.presupuestoMensualTokens = presupuestoMensualTokens;
    }
}
