package Consesionario;

import com.example.programaciontres.Vehiculo;

public class Main {

    public static void main(String[] args) {

        CosesionarioVehiculo.registrarCamion("Nissan","RV606","1","2020",100000,6,200);
        CosesionarioVehiculo.registrarAuto("BMW","K69","12","2020",100000,4,4,true);
        CosesionarioVehiculo.registrarAuto("Ferrari","K68","123","2022",100000,4,4,true);
        System.out.println(CosesionarioVehiculo.num_camiones);

        Vehiculo v1=CosesionarioVehiculo.buscarVehiculoPlaca("K69");

        System.out.println(v1.getPlaca());

        for (Vehiculo v: CosesionarioVehiculo.vehiculoArrayList) {
            System.out.println(v.getMarca() + " " + v.getPlaca()+" "+ v.getModelo()+" "+v.getReferencia()+" "+v.getPrecio());
        }

        CosesionarioVehiculo.listarVehiculosDisponibles();

        for (Vehiculo v: CosesionarioVehiculo.vehiculoArrayList) {
            System.out.println(v.getMarca() + " " + v.getPlaca()+" "+ v.getModelo()+" "+v.getReferencia()+" "+v.getPrecio());
        }

        System.out.println("Eliminando...");

        CosesionarioVehiculo.eliminarVehiculo("K68");

        for (Vehiculo v: CosesionarioVehiculo.vehiculoArrayList) {
            System.out.println(v.getMarca() + " " + v.getPlaca()+" "+ v.getModelo()+" "+v.getReferencia()+" "+v.getPrecio());
        }

        System.out.println("Vendiendo...");
        CosesionarioVehiculo.venderAuto("K69");
        System.out.println("Vendidos...");

        for (Vehiculo v: CosesionarioVehiculo.vehiculoVendidos) {
            System.out.println(v.getMarca() + " " + v.getPlaca()+" "+ v.getModelo()+" "+v.getReferencia()+" "+v.getPrecio());
        }









    }

}
