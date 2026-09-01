package edu.utp.saasprompts.models;

public class Usuario {
    private Long id;
    private String nombre;
    private String email;
    private int limiteTokens; // Cuota máxima permitida en la nube
    private int tokensConsumidos; // Control del historial de Deep Research

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String email, int limiteTokens, int tokensConsumidos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.limiteTokens = limiteTokens;
        this.tokensConsumidos = tokensConsumidos;
    }

    // Getters y Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLimiteTokens() {
        return limiteTokens;
    }

    public void setLimiteTokens(int limiteTokens) {
        this.limiteTokens = limiteTokens;
    }

    public int getTokensConsumidos() {
        return tokensConsumidos;
    }

    public void setTokensConsumidos(int tokensConsumidos) {
        this.tokensConsumidos = tokensConsumidos;
    }
}