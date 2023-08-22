package Consesionario;

import com.example.programaciontres.Menu;
import com.example.programaciontres.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CosesionarioVehiculo {


    public static int num_motos=0;
    public static int num_autos=0;
    public static int num_camiones=0;

    public static int ventas_vehiculos=0;


    public static ArrayList<Vehiculo> vehiculoVendidos=new ArrayList<>();
    public static ArrayList<Vehiculo> vehiculoArrayList=new ArrayList<>();

    public static int num_vendidos=0;

    public static double acum_ventas=0;


    /* Funcion que sirve para quemar los vehiculos en el array list
    * No tiene retorno
    *
    *
     */

    public static void llenarLista (){

        vehiculoArrayList.add(new Auto("Nissan","KM604","123454","2019",10000,
                4,4,true));
        Menu.placas.add("KM604");

        vehiculoArrayList.add(new Auto("BMW","KM603","123456","2019",13000,
                4,2,true));
        Menu.placas.add("KM603");

        vehiculoArrayList.add(new Moto("Pulsar","SS604","123457","2023",7000,
                2,300,23));
        Menu.placas.add("SS604");

        vehiculoArrayList.add(new Moto("AKT","TT326","123457","2022",5000,
                2,300,23));
        Menu.placas.add("TT326");
    }

    /* Funcion para registrar un auto
     * No retorna nada
     * add. en el arraylist de vehiculos
     */


    public static void registrarAuto (String marca, String placa, String referencia, String modelo,double precio,int num_ruedas,int num_puertas, boolean is_gasolina){
        vehiculoArrayList.add(new Auto(marca, placa, referencia, modelo,precio,num_ruedas, num_puertas, is_gasolina));

    }

    /* Funcion para registrar un camion
     * No retorna nada
     * add. en el arraylist de vehiculos
     */

    public static void registrarCamion (String marca, String placa, String referencia, String modelo,double precio, int num_ruedas,int capCarga){
        vehiculoArrayList.add(new Camion(marca, placa, referencia, modelo, precio, num_ruedas, capCarga));

    }

    /* Funcion para registrar un moto
     * No retorna nada
     * add. en el arraylist de vehiculos
     */

    public static void registrarMoto (String marca, String placa, String referencia, String modelo,double precio, int num_ruedas, int cilindraje, double tam_tanque){
        vehiculoArrayList.add(new Moto(marca, placa, referencia, modelo, precio, num_ruedas, cilindraje, tam_tanque));

    }
    /* Funcion para eiminar un vehiculo
     * No retorna nada
     * add. en el arraylist de vehiculos
     */

    public static void eliminarVehiculo (String placa){
        Vehiculo v=buscarVehiculoPlaca(placa);
        vehiculoArrayList.remove(v);
    }

    /* Metodo para filtrar el vehiculo por la placa
     * Retorna el vehiculo
     */

    public static Vehiculo buscarVehiculoPlaca (String placa){
        return vehiculoArrayList.stream().filter(x -> x.getPlaca().equals(placa)).collect(Collectors.toList()).get(0);
    }

    /* Metodo para buscar el vehiculo por la placa
     * Retorna el vehiculo
     */

    public static Vehiculo buscarVehiculo (String placa){
        Vehiculo aux=null;
        for(int i=0;i<vehiculoArrayList.size();i++){
            if(vehiculoArrayList.get(i).getPlaca().equals(placa)){
                aux=vehiculoArrayList.get(i);
            }
        }

        return aux;
    }


    public static boolean buscarVehiculo2 (String placa){

        boolean bandera=false;

        for (int i=0;i> vehiculoArrayList.size();i++) {
            if (vehiculoArrayList.get(i).getPlaca().equals(placa)){
                bandera=true;

            }
        }
        return bandera;
    }

    /* Metodo para buscar el vehiculo por el modelo
     * Retorna un boleano
     */

    public static boolean buscarModelo (String placa){

        boolean bandera=false;

        for (int i=0;i> vehiculoArrayList.size();i++) {
            if (vehiculoArrayList.get(i).getModelo().equals(placa)){
                bandera=true;

            }
        }
        return bandera;
    }
    /* Metodo para buscar el vehiculo por la referencia
     * Retorna un boleano
     */

    public static boolean buscarRefrencia (String placa){

        boolean bandera=false;

        for (int i=0;i> vehiculoArrayList.size();i++) {
            if (vehiculoArrayList.get(i).getReferencia().equals(placa)){
                bandera=true;

            }
        }
        return bandera;
    }

    /* Metodo para filtrar el vehiculo por el modelo
     * Retorna el vehciulo
     */


    public static Vehiculo buscarVehiculoModelo (String modelo){
        return vehiculoArrayList.stream().filter(x -> x.getModelo().equals(modelo)).collect(Collectors.toList()).get(0);
    }
    /* Metodo para filtrar el vehiculo por la referencia
     * Retorna el vehiculo
     */

    public static Vehiculo buscarVehiculoReferencia (String referencia){
        return vehiculoArrayList.stream().filter(x -> x.getReferencia().equals(referencia)).collect(Collectors.toList()).get(0);
    }
    /* Metodo para filtrar las motos del observable list
     * Retorna un array
     */

    public static ObservableList<Vehiculo> flitrarMoto (){
        ObservableList<Vehiculo>vehiculoObservableList= FXCollections.observableArrayList();

        for(Vehiculo v :vehiculoArrayList){
            if(v instanceof Moto){
                vehiculoObservableList.add(v);
            }
        }
        return vehiculoObservableList;

    }

    /* Metodo para filtrar los camiones del observable list
     * Retorna un array
     */

    public static ObservableList<Vehiculo> flitrarCamion (){
        ObservableList<Vehiculo>vehiculoObservableList= FXCollections.observableArrayList();

        for(Vehiculo v :vehiculoArrayList){
            if(v instanceof Camion){
                vehiculoObservableList.add(v);
            }
        }
        return vehiculoObservableList;

    }

    /* Metodo para filtrar los autos del observable list
     * Retorna un array
     */
    public static ObservableList<Vehiculo> flitrarAuto (){
        ObservableList<Vehiculo>vehiculoObservableList= FXCollections.observableArrayList();

        for(Vehiculo v :vehiculoArrayList){
            if(v instanceof Auto){
                vehiculoObservableList.add(v);
            }
        }
        return vehiculoObservableList;

    }

    /* Metodo para listar los vehiculos disponibles del array
     * Retorna un array
     */


    public static void listarVehiculosDisponibles (){
        vehiculoArrayList.sort(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getPlaca));
    }
    /* Metodo para listar los vehiculos disponibles del array
     * Retorna un array
     */

    public static void listarVehiculosDisponibles2 (ObservableList<Vehiculo>vehiculoObservableList){
        vehiculoObservableList.sort(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getPlaca));
    }

    public static void venderMoto (Vehiculo v){
        vehiculoArrayList.remove(v);
        vehiculoVendidos.add(v);
        num_motos--;
        ventas_vehiculos++;

    }

    public static void venderAuto (String placa){
        Vehiculo v=buscarVehiculoPlaca(placa);
        vehiculoArrayList.remove(v);
        vehiculoVendidos.add(v);
        num_autos--;
        ventas_vehiculos++;

    }

    public static void venderCamion(Vehiculo v){
        vehiculoArrayList.remove(v);
        vehiculoVendidos.add(v);
        num_camiones--;
        ventas_vehiculos++;

    }

    public static void actualizarVehiculo (Vehiculo v){
        Vehiculo aux=v;
        eliminarVehiculo(v.getPlaca());
        vehiculoArrayList.add(aux);
    }






}
