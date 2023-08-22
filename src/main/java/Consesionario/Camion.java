package Consesionario;

import com.example.programaciontres.Vehiculo;

public class Camion extends Vehiculo {
    private int capCarga;

    public Camion(String marca, String placa, String referencia, String modelo,double precio, int num_ruedas,int capCarga) {
        super(marca, placa, referencia, modelo, precio, num_ruedas);
        this.capCarga = capCarga;
    }

    @Override
    public void queSoy() {
        System.out.println("Soy un camion");
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }
}
