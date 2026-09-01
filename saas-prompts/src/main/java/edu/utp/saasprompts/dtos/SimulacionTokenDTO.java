package edu.utp.saasprompts.dtos;

import java.util.List;
import edu.utp.saasprompts.models.NodoPrompt;

// El frontend enviará la lista de nodos y el backend calculará el consumo antes de ejecutar.
public class SimulacionTokenDTO {
    private Long usuarioId;
    private List<NodoPrompt> secuenciaNodos;

    public SimulacionTokenDTO() {
    }

    // Getters y Setters
    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public List<NodoPrompt> getSecuenciaNodos() {
        return secuenciaNodos;
    }

    public void setSecuenciaNodos(List<NodoPrompt> secuenciaNodos) {
        this.secuenciaNodos = secuenciaNodos;
    }
}