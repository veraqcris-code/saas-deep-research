package edu.utp.saasprompts.models;

public class NodoPrompt {
    private String idNodo; // ID único generado en el lienzo frontend
    private String contenidoPrompt;
    private String modeloIA; // Ej. "gpt-4", "gemini-1.5-pro"
    private double temperatura; // Parámetro técnico (0.0 a 1.0)
    private int topK; // Parámetro técnico

    public NodoPrompt() {
    }

    // Getters y Setters
    public String getIdNodo() {
        return idNodo;
    }

    public void setIdNodo(String idNodo) {
        this.idNodo = idNodo;
    }

    public String getContenidoPrompt() {
        return contenidoPrompt;
    }

    public void setContenidoPrompt(String contenidoPrompt) {
        this.contenidoPrompt = contenidoPrompt;
    }

    public String getModeloIA() {
        return modeloIA;
    }

    public void setModeloIA(String modeloIA) {
        this.modeloIA = modeloIA;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getTopK() {
        return topK;
    }

    public void setTopK(int topK) {
        this.topK = topK;
    }
}