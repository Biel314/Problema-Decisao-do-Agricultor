package controller;

import model.Sensores;

public class CtlDecididor {
    public void regar() {
        System.out.println("REGAR");
    }

    public void naoRegar() {
        System.out.println("NAO REGAR");
    }

    public void checagemGeral(Sensores sensor) {

        if (sensor.getTemperaturaAtual() > 30.0 && sensor.getUmidadeSolo() < 0.5) {
            regar();
        } else {
            naoRegar();
        }
    }

    public void verificarPrevisao(Sensores sensor) {

        if (sensor.getPrevisaoChuva() == 1) {
            naoRegar();
        } else {
            checagemGeral(sensor);
        }
    }
}