package com.example.programaciontres;

public abstract class Vehiculo {
    //snake case
    //lowerCamiCase

    private String marca;
    private String placa;
    private String referencia;
    private String modelo;

    private double precio;
    private int num_ruedas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    /* Construtor de la clase vehiculo
     */

    public Vehiculo(String marca, String placa, String referencia, String modelo,double precio, int num_ruedas) {
        this.marca = marca;
        this.placa = placa;
        this.referencia = referencia;
        this.modelo = modelo;
        this.num_ruedas = num_ruedas;
        this.precio=precio;
    }

    /* Construtor vacio de la clase vehiculo
     */

    public Vehiculo(){

    }


    public abstract void queSoy ();


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
