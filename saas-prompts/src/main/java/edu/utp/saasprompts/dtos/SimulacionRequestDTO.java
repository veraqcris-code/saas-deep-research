package edu.utp.saasprompts.dtos;

import java.util.Map;

public class SimulacionRequestDTO {

    private Long lienzoId;
    private Map<String, Object> parametros;

    public SimulacionRequestDTO() {
    }

    public SimulacionRequestDTO(Long lienzoId, Map<String, Object> parametros) {
        this.lienzoId = lienzoId;
        this.parametros = parametros;
    }

    public Long getLienzoId() {
        return lienzoId;
    }

    public void setLienzoId(Long lienzoId) {
        this.lienzoId = lienzoId;
    }

    public Map<String, Object> getParametros() {
        return parametros;
    }

    public void setParametros(Map<String, Object> parametros) {
        this.parametros = parametros;
    }
}
