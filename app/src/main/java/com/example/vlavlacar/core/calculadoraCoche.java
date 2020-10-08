package com.example.vlavlacar.core;

public class calculadoraCoche {
    private double consumo;
    private double kilometros;

    private enum tipoCarretera {
        A,
        N,
        C;}
    ;
    private int horas;
    private int minutos;

    public calculadoraCoche(double consumo, double kilometros, int horas, int minutos, String tipoCarretera) {
        this.consumo = consumo;
        this.kilometros = kilometros;
        this.horas = horas;
        this.minutos = minutos;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
