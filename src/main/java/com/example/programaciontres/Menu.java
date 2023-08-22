package com.example.programaciontres;

import Consesionario.Auto;
import Consesionario.Camion;
import Consesionario.CosesionarioVehiculo;
import Consesionario.Moto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Menu implements Initializable {

    //

    @FXML
    private Button boton_actualizar;

    @FXML
    private Button boton_actualizar_tabla;

    @FXML
    private Button boton_buscar;

    @FXML
    private Button boton_buscar1;

    @FXML
    private Button boton_eliminarV;

    @FXML
    private Button boton_inicio;

    @FXML
    private Button boton_registro;

    @FXML
    private Button boton_registroV;

    @FXML
    private Button boton_ventas;

    @FXML
    private TableColumn<Vehiculo, String> col_marca;

    @FXML
    private TableColumn<Vehiculo, String> col_modelo;

    @FXML
    private TableColumn<Vehiculo, String> col_placa;

    @FXML
    private TableColumn<Vehiculo, Double> col_precio;

    @FXML
    private TableColumn<Vehiculo, String> col_referencia;

    @FXML
    private TableColumn<Vehiculo, String> col_marca1;

    @FXML
    private TableColumn<Vehiculo, String> col_modelo1;

    @FXML
    private TableColumn<Vehiculo, String> col_placa1;

    @FXML
    private TableColumn<Vehiculo, Double> col_precio1;

    @FXML
    private TableColumn<Vehiculo, String> col_referencia1;

    @FXML
    private TableColumn<Vehiculo, String> col_marca11;

    @FXML
    private TableColumn<Vehiculo, String> col_modelo11;

    @FXML
    private TableColumn<Vehiculo, String> col_placa11;

    @FXML
    private TableColumn<Vehiculo, Double> col_precio11;

    @FXML
    private TableColumn<Vehiculo, String> col_referencia11;

    @FXML
    private Label label_aux;

    @FXML
    private Label label_busqueda;
    @FXML
    private Label label_inicio;

    @FXML
    private TableColumn<Vehiculo, Integer> num_ruedas;
    @FXML
    private TableColumn<Vehiculo, Integer> num_ruedas1;
    @FXML
    private TableColumn<Vehiculo, Integer> num_ruedas11;

    @FXML
    private Pane pane_bienvenido;

    @FXML
    private Pane pane_registroV;

    @FXML
    private Pane pane_registroV1;

    @FXML
    private ChoiceBox<String> selec_gasolina;

    @FXML
    private TableView<Vehiculo> tblRegistroVehiculos;

    @FXML
    private Pane pane_ventas;

    @FXML
    private TextField txt_carga;

    @FXML
    private TextField txt_cilindraje;

    @FXML
    private TextField txt_marca;

    @FXML
    private TextField txt_modelo;

    @FXML
    private TextField txt_placa;

    @FXML
    private TextField txt_precio;

    @FXML
    private TextField txt_puertas;

    @FXML
    private TextField txt_referencia;

    @FXML
    private TextField txt_ruedas;

    @FXML
    private TableView<Vehiculo> tblRegistroVehiculos2;

    @FXML
    private TableView<Vehiculo> tblRegistroVehiculos3;


    @FXML
    private TextField txt_cliente;




    @FXML
    private TextField txt_placa1;



    @FXML
    private TextField txt_tanque;

    @FXML
    private Label num_vehiculos;

    @FXML
    private Label ventas_acum;



    @FXML
    private ChoiceBox<String> box_vehiculo;

    //ARREGLOS QUE CONTIENEN LOS ELEMENTOS DE LOS BOXCHOICE

    String [] seleccion={"Si","No"};

    String [] seleccionV={"Moto","Auto","Camión"};

    boolean centinela=false;

    //OBSERVABLE LIST PARA TABLAS DE LA INTERFAZ, PARA QUE LAS LISTAS DE CONSESIONARIO SEAN VISIBLES

    private ObservableList<Vehiculo> vehiculoObservableList;


    private ObservableList<Vehiculo> vehiculoObservableList2;

    private ObservableList<Vehiculo> vendidosObservable;



    private String selecVehiculo;

    private String selec_gaso;

    public static ArrayList<String> placas=new ArrayList<>();

    public static String indice="";

    public static String placaAux="";

    //FUNCION INITIALIZE QUE SIRVE PARA ENLAZAR LAS COLUMNAS Y LAS FILAS CON LOS ATRIBUTOS DEL OBJETO VEHICULO



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        selec_gasolina.getItems().addAll(seleccion);
        selec_gasolina.setOnAction(this::getSeleccion);

        box_vehiculo.getItems().addAll(seleccionV);
        box_vehiculo.setOnAction(this::getSeleccion);

        vehiculoObservableList= FXCollections.observableArrayList();
        vehiculoObservableList2= FXCollections.observableArrayList();
        vendidosObservable= FXCollections.observableArrayList();

        col_marca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        col_placa.setCellValueFactory(new PropertyValueFactory<>("placa"));
        col_modelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        col_referencia.setCellValueFactory(new PropertyValueFactory<>("referencia"));
        col_precio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        num_ruedas.setCellValueFactory(new PropertyValueFactory<>("num_ruedas"));

        col_marca1.setCellValueFactory(new PropertyValueFactory<>("marca"));
        col_placa1.setCellValueFactory(new PropertyValueFactory<>("placa"));
        col_modelo1.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        col_referencia1.setCellValueFactory(new PropertyValueFactory<>("referencia"));
        col_precio1.setCellValueFactory(new PropertyValueFactory<>("precio"));
        num_ruedas1.setCellValueFactory(new PropertyValueFactory<>("num_ruedas"));

        col_marca11.setCellValueFactory(new PropertyValueFactory<>("marca"));
        col_placa11.setCellValueFactory(new PropertyValueFactory<>("placa"));
        col_modelo11.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        col_referencia11.setCellValueFactory(new PropertyValueFactory<>("referencia"));
        col_precio11.setCellValueFactory(new PropertyValueFactory<>("precio"));
        num_ruedas11.setCellValueFactory(new PropertyValueFactory<>("num_ruedas"));


    }

    public void getSeleccion (ActionEvent event){
        selecVehiculo=box_vehiculo.getValue();
        indice=selecVehiculo;

    }

    //FUNCION QUE SIRVE PARA LA ACCION CUANDO SE PRESIONA REGISTRAR UN VEHICULO NUEVO
    //COMPRUEBA TAMBIEN SI EL VEHICULO YA FUE REGISTRADO


    @FXML
    void OnBotonRegistrarV(ActionEvent event) throws IOException {

        double precio=Double.parseDouble(combrobarVacio(txt_precio.getText()));

        String placa=txt_placa.getText();
        placaAux=placa;

        String marca=txt_marca.getText();
        String modelo=txt_modelo.getText();
        String referencia=txt_referencia.getText();
        int num_ruedas2=Integer.parseInt(combrobarVacio(txt_ruedas.getText()));

        int cilindraje=Integer.parseInt(combrobarVacio(txt_cilindraje.getText()));
        double tamano_tan=Double.parseDouble(combrobarVacio(txt_tanque.getText()));

        int num_puertas=Integer.parseInt(combrobarVacio(txt_puertas.getText()));
        boolean gaso=false;

        int carga=Integer.parseInt(combrobarVacio(txt_carga.getText()));


        boolean centi=buscarPlaca(placa);

        if(!centi){

            if(selecVehiculo.equals("Moto")||indice.equals("Moto")){

                txt_puertas.setOpacity(0);
                Moto moto=new Moto(marca,placa,referencia,modelo,precio,num_ruedas2,cilindraje,tamano_tan);
                placas.add(placa);

                vehiculoObservableList.add(moto);
                CosesionarioVehiculo.vehiculoArrayList.add(moto);
                tblRegistroVehiculos.setItems(vehiculoObservableList);

                mostrarVentana();



            }else if(selecVehiculo.equals("Auto")||indice.equals("Auto")){
                Auto auto=new Auto(marca,placa,referencia,modelo,precio,num_ruedas2,num_puertas,gaso);
                vehiculoObservableList.add(auto);
                CosesionarioVehiculo.vehiculoArrayList.add(auto);
                tblRegistroVehiculos.setItems(vehiculoObservableList);
                placas.add(placa);

                mostrarVentana();

            }else if(selecVehiculo.equals("Camión")||indice.equals("Camion")){
                Camion auto=new Camion(marca,placa,referencia,modelo,precio,num_ruedas2,carga);
                vehiculoObservableList.add(auto);
                CosesionarioVehiculo.vehiculoArrayList.add(auto);
                tblRegistroVehiculos.setItems(vehiculoObservableList);
                placas.add(placa);

                mostrarVentana();

            }


        }else{
            Alert alert=new Alert (Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("El Vehiculo ya se Registro");
            alert.showAndWait();

        }


    }

    //FUNCION OPTIMIZADA, QUE SIRVE PARA RESPRESENTAR DE QUE EL VEHICULO SE ESTA REGISTRANDO
    //Y MOSTRAR LA PLACA Y QUE VEHICULO SE REGISTRO

    public void mostrarVentana () throws IOException {
        Stage stage=new Stage();
        Parent root= FXMLLoader.load(getClass().getResource("Emergente.fxml"));
        Scene escena=new Scene(root);
        stage.setScene(escena);
        stage.show();

    }

    //FUNCION PARA BUSCAR PLACA EN UN ARRAYLIST APARTE, QUE SIRVE PARA COMPROBAR DE QUE SI EXISTE Y NO GENERE ERROR
    //CON EL FILTRO DE CONSESIONARIO

    public boolean buscarPlaca (String placa){

        boolean centi=false;
        if (placa.equals("")){
            centi=true;
        }else{
            if (placas.contains(placa)){
                centi= true;
            }
        }
        return centi;

    }


    public static boolean convertirSeleccion(String seleccion){
        boolean centi=false;
        if(seleccion.equals("")) {

        }else if (seleccion.equals("Si")) {
            centi=true;
        }
        return centi;

    }

    @FXML
    void ActualizarTabla2(ActionEvent event) {


    }

    //FUNCION PARA BUSCAR VEHICULO Y MOSTRARLO EN LA TABLA, UTILIZO UNA TABLA AUXILIAR PARA GUADAR ESTE,
    //Y QUE LA OTRA TABLA QUEDE IGUAL
    @FXML
    void OnBuscarVehiculo(ActionEvent event) {

        if(buscarPlaca(txt_placa.getText())){
            label_busqueda.setText("Busqueda Exitosa");
            Vehiculo v=CosesionarioVehiculo.buscarVehiculoPlaca(txt_placa.getText());
            vehiculoObservableList2=FXCollections.observableArrayList();
            vehiculoObservableList2.add(v);

            tblRegistroVehiculos.setItems(vehiculoObservableList2);


        }else{
            label_busqueda.setText("Busqueda Fallida");
        }


    }

    //FUNCION PARA ELIMINAR UN VEHICULO DE LAS LISTAS, TANTO DE LA DE OBSERVABLE LIST COMO LA DE CONSESIONARIO

    @FXML
    void OnEliminarVehiculo(ActionEvent event) {

        Vehiculo v=CosesionarioVehiculo.buscarVehiculoPlaca(txt_placa.getText());
        CosesionarioVehiculo.vehiculoArrayList.remove(v);
        vehiculoObservableList.remove(v);
        placas.remove(txt_placa.getText());
        tblRegistroVehiculos.setItems(vehiculoObservableList);

    }

    //FUNCION PARA ACTUALIZAR TABLAS

    @FXML
    void ActualizarTabla(ActionEvent event) {
        tblRegistroVehiculos.setItems(vehiculoObservableList);
        tblRegistroVehiculos2.setItems(vehiculoObservableList);


    }

    /* Accion actualizar datos de los vehiculos
     * No retorna nada
     */


    @FXML
    void OnActualizarDatos(ActionEvent event) {

        boolean centi=buscarPlaca(txt_placa.getText());
        if(centi){
            Vehiculo v=CosesionarioVehiculo.buscarVehiculoPlaca(txt_placa.getText());
            CosesionarioVehiculo.vehiculoArrayList.remove(v);
            vehiculoObservableList.remove(v);
            placas.remove(txt_placa.getText());

            tblRegistroVehiculos.setItems(vehiculoObservableList);

            String placa=txt_placa.getText();
            double precio=Double.parseDouble(combrobarVacio(txt_precio.getText()));
            String marca=txt_marca.getText();
            String modelo=txt_modelo.getText();
            String referencia=txt_referencia.getText();
            int num_ruedas2=Integer.parseInt(combrobarVacio(txt_ruedas.getText()));

            int cilindraje=Integer.parseInt(combrobarVacio(txt_cilindraje.getText()));
            double tamano_tan=Double.parseDouble(combrobarVacio(txt_tanque.getText()));

            int num_puertas=Integer.parseInt(combrobarVacio(txt_puertas.getText()));
            boolean gaso=false;

            int carga=Integer.parseInt(combrobarVacio(txt_carga.getText()));


            if (v instanceof Moto){


                Moto moto=new Moto(marca,placa,referencia,modelo,precio,num_ruedas2,cilindraje,tamano_tan);
                placas.add(placa);

                vehiculoObservableList.add(moto);
                CosesionarioVehiculo.vehiculoArrayList.add(moto);
                tblRegistroVehiculos.setItems(vehiculoObservableList);

            }else if (v instanceof Auto){
                Auto auto=new Auto(marca,placa,referencia,modelo,precio,num_ruedas2,num_puertas,gaso);
                vehiculoObservableList.add(auto);
                CosesionarioVehiculo.vehiculoArrayList.add(auto);
                tblRegistroVehiculos.setItems(vehiculoObservableList);
                placas.add(placa);

            }else if (v instanceof Camion){
                Camion auto=new Camion(marca,placa,referencia,modelo,precio,num_ruedas2,carga);
                vehiculoObservableList.add(auto);
                CosesionarioVehiculo.vehiculoArrayList.add(auto);
                tblRegistroVehiculos.setItems(vehiculoObservableList);
                placas.add(placa);

            }

        }


    }

    /* Accion para listar los vehiculos disponibles
     * No retorna nada
     */

    @FXML
    void OnListar(ActionEvent event) {
        CosesionarioVehiculo.listarVehiculosDisponibles();
        CosesionarioVehiculo.listarVehiculosDisponibles2(vehiculoObservableList);
        tblRegistroVehiculos.setItems(vehiculoObservableList);
        int cont1=0;
        int cont2=0;
        int cont3=0;

        for (Vehiculo v:CosesionarioVehiculo.vehiculoArrayList){
            if(v instanceof Moto){
                cont1++;

            }else if(v instanceof Auto){
                cont2++;

            }else if(v instanceof Camion){
                cont3++;
            }
        }

        System.out.println("Moto:"+cont1+" Auto:"+cont2+" Camion:"+cont3);
    }

    /* Metodo para combrobar el vacio de los txt, porque al pasarlos a enteros o doubles puede generar error
     * Retorna 0 o si no esta vacio no cambia el txt
     */


    public String combrobarVacio (String txt){
        String r="0";
        if (txt.equals("")){
            return r;
        }
        return txt;

    }
    /* Metodo para combrobar el vacio de los txt, porque al pasarlos a enteros o doubles puede generar error
     * Retorna 0 o si no esta vacio no cambia el txt
     */
    public String combrobarVacio2 (String txt){
        String r=" ";
        if (txt.equals("")){
            return r;
        }
        return txt;

    }

    /* Accion que sirve para cambiar la vista (pane) correspondiendo con la seleccion
     */


    @FXML
    private void handleClick (ActionEvent event){


        if (event.getSource()==boton_registroV){
            pane_registroV.toFront();
            label_inicio.setText("Registro");


        }else if (event.getSource()==boton_inicio) {
            pane_bienvenido.toFront();
            label_inicio.setText("Inicio");

        }else if (event.getSource()==boton_ventas) {
            pane_ventas.toFront();
            label_inicio.setText("Ventas");
        }

    }

    /* Accion de boton para filtrar el tipo, se utiliza un observable list auxiliar
     * No retorna nada
     */


    @FXML
    void OnFiltrarAutos(ActionEvent event) {
        ObservableList<Vehiculo>aux;
        aux=CosesionarioVehiculo.flitrarAuto();
        tblRegistroVehiculos.setItems(aux);

    }

    /* Accion de boton para filtrar el tipo, se utiliza un observable list auxiliar
     * No retorna nada
     */

    @FXML
    void OnFiltrarCamion(ActionEvent event) {
        ObservableList<Vehiculo>aux;
        aux=CosesionarioVehiculo.flitrarCamion();
        tblRegistroVehiculos.setItems(aux);

    }
    /* Accion para lenar la lista
     * Tiene un fallo a la hora de vender el vehciculo (Registrar mejor el vehciulo para que no genere ese error)
     */

    @FXML
    void OnLLenarLista(ActionEvent event) {

        boolean centi=buscarPlaca("KM604");
        boolean centi2=buscarPlaca("KM603");
        boolean centi3=buscarPlaca("SS604");
        boolean centi4=buscarPlaca("TT326");

        if(!centi&&!centi2&&!centi3&&!centi4){
            CosesionarioVehiculo.llenarLista();
            vehiculoObservableList.add(new Auto("Nissan","KM604","123454","2019",10000,
                    4,4,true));
            vehiculoObservableList.add(new Auto("BMW","KM603","123456","2019",13000,
                    4,2,true));
            vehiculoObservableList.add(new Moto("Pulsar","SS604","123457","2023",7000,
                    2,300,23));
            vehiculoObservableList.add(new Moto("AKT","TT326","123457","2022",5000,
                    2,300,23));

            tblRegistroVehiculos.setItems(vehiculoObservableList);
        }

    }

    /* Accion de boton para filtrar el tipo, se utiliza un observable list auxiliar
     * No retorna nada
     */


    @FXML
    void OnFlitrarMoto(ActionEvent event) {
        ObservableList<Vehiculo>aux;
        aux=CosesionarioVehiculo.flitrarMoto();
        tblRegistroVehiculos.setItems(aux);

    }

    /* Accion para vender un vehiculo, lo que hace es pasar un objeto de un array para otro
     * No retorna nada
     */


    @FXML
    void OnVender(ActionEvent event) {

        String placa=txt_placa1.getText();

        boolean centi=buscarPlaca(placa);

        if(centi){
            Vehiculo v=CosesionarioVehiculo.buscarVehiculo(txt_placa1.getText());
            double precioAux=v.getPrecio();


            CosesionarioVehiculo.vehiculoArrayList.remove(v);
            vehiculoObservableList.remove(v);
            placas.remove(txt_placa.getText());

            tblRegistroVehiculos2.setItems(vehiculoObservableList);

            CosesionarioVehiculo.vehiculoVendidos.add(v);
            vendidosObservable.add(v);

            tblRegistroVehiculos3.setItems(vendidosObservable);

            CosesionarioVehiculo.num_vendidos=CosesionarioVehiculo.num_vendidos+1;
            CosesionarioVehiculo.acum_ventas=CosesionarioVehiculo.acum_ventas+precioAux;

            num_vehiculos.setText(""+CosesionarioVehiculo.num_vendidos);
            ventas_acum.setText(""+CosesionarioVehiculo.acum_ventas);

            txt_placa1.setText("");

        }else{
            Alert alert=new Alert (Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Venta Interrumpida");
            alert.setContentText("  Placa No Encontrada");
            alert.showAndWait();

        }

    }


    /* Accion para cancelar la transaccion
     * No retorna nada
     */


    @FXML
    void OnCancelar(ActionEvent event) {

        Alert alert=new Alert (Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("CANCELADO");
        alert.setContentText("Venta Interrumpida");
        alert.showAndWait();


    }

    /* Accion para cerrar el programa
     */

    @FXML
    void OnCerrarPrograma(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }



}
