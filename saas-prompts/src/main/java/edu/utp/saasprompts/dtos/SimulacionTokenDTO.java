package edu.utp.saasprompts.dtos;

import java.math.BigDecimal;

public class SimulacionTokenDTO {

    private boolean exitosa;
    private Long tokensConsumidos;
    private BigDecimal costoEstimado;
    private String resultado;

    public SimulacionTokenDTO() {
    }

    public SimulacionTokenDTO(boolean exitosa, Long tokensConsumidos, BigDecimal costoEstimado, String resultado) {
        this.exitosa = exitosa;
        this.tokensConsumidos = tokensConsumidos;
        this.costoEstimado = costoEstimado;
        this.resultado = resultado;
    }

    public boolean isExitosa() {
        return exitosa;
    }

    public void setExitosa(boolean exitosa) {
        this.exitosa = exitosa;
    }

    public Long getTokensConsumidos() {
        return tokensConsumidos;
    }

    public void setTokensConsumidos(Long tokensConsumidos) {
        this.tokensConsumidos = tokensConsumidos;
    }

    public BigDecimal getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(BigDecimal costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
