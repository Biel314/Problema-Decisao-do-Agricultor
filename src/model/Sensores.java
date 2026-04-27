package model;

public class Sensores {

    private double temperaturaAtual;
    private double umidadeSolo;
    private int previsaoChuva;

    public Sensores(double temperaturaAtual, double umidadeSolo, int previsaoChuva) {
        this.temperaturaAtual = temperaturaAtual;
        this.umidadeSolo = umidadeSolo;
        this.previsaoChuva = previsaoChuva;
        
    }

    public double getTemperaturaAtual() {
    	
        return temperaturaAtual;
    }

    public double getUmidadeSolo() {
    	
        return umidadeSolo;
    }

    public int getPrevisaoChuva() {
    	
        return previsaoChuva;
    }
}