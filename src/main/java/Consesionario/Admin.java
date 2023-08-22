package Consesionario;

import com.example.programaciontres.Vehiculo;

import java.util.stream.Collectors;

public class Admin {
    private String usuario;
    private String contraseña;

    public Admin(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Admin (){

    }
    public static void actualizarDatos (Vehiculo vehiculo){
        String aux=vehiculo.getPlaca();
        Vehiculo aux2=CosesionarioVehiculo.vehiculoArrayList.stream().filter(x -> x.getPlaca().equals(aux)).collect(Collectors.toList()).get(0);
        CosesionarioVehiculo.vehiculoArrayList.remove(aux2);
        CosesionarioVehiculo.vehiculoArrayList.add(vehiculo);

    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
