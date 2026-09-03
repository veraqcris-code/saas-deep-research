package edu.utp.saasprompts.dtos;

public class ProyectoResponseDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private Long presupuestoMensualTokens;
    private Long tokensConsumidosHoy;

    public ProyectoResponseDTO() {
    }

    public ProyectoResponseDTO(Long id, String nombre, String descripcion, Long presupuestoMensualTokens, Long tokensConsumidosHoy) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.presupuestoMensualTokens = presupuestoMensualTokens;
        this.tokensConsumidosHoy = tokensConsumidosHoy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getTokensConsumidosHoy() {
        return tokensConsumidosHoy;
    }

    public void setTokensConsumidosHoy(Long tokensConsumidosHoy) {
        this.tokensConsumidosHoy = tokensConsumidosHoy;
    }
}
