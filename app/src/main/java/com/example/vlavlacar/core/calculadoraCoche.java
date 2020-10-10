package com.example.vlavlacar.core;

public class calculadoraCoche {
    private double consumo;
    private int kilometros;
    private int minutos;

    private enum TipoCarretera {A, N, C}

    ;
    private final char[] StrTipoCarretera = {'A', 'N', 'C'};
    private final int[] velocidades = {100, 80, 50};
    private TipoCarretera tipoCarretera;


    public calculadoraCoche() {
        this.consumo = 8.0;
        this.kilometros = 0;
        this.minutos = 0;
        this.tipoCarretera = TipoCarretera.A;
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

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }


    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setTiempo(int horas, int minutos) {
        this.setMinutos((horas * 60) + minutos);
    }

    public TipoCarretera getTipoCarretera() {
        return this.tipoCarretera;
    }

    public void setTipoCarretera(TipoCarretera tipoCarretera) {
        this.tipoCarretera = tipoCarretera;
    }

    public void setTipoCarretera(char tipo) {
        tipo = Character.toUpperCase(tipo);
        int temp = 0;

        for (int i = 0; i < StrTipoCarretera.length; i++) {
            if (StrTipoCarretera[i] == tipo) {
                temp = i;
                break;
            }
        }
        this.tipoCarretera = TipoCarretera.values()[temp];
    }

    public double calcularConsumo() {
        return (getKilometros() / 100) * getConsumo();
    }

    public int calcularTiempo() {
        double velocidad = this.velocidades[this.tipoCarretera.ordinal()];
        return (int) Math.round((this.getKilometros() / velocidad) * 60.0);
    }

}
