
package co.edu.uniquindio.poo;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.codigo.Ahorro;
import co.edu.uniquindio.poo.codigo.Banco;
import co.edu.uniquindio.poo.codigo.Corriente;
import co.edu.uniquindio.poo.codigo.CuentaBancaria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearBanco;

    @FXML
    private Button btnCrearCUenta;

    @FXML
    private Button btnCrearCuentaCorriente;

    @FXML
    private Button btnDepositar;

    @FXML
    private Button btnRetirar;

    @FXML
    private Label txListaCuentas;

    @FXML
    private TextField txApellidoTitular;

    @FXML
    private TextField txCodigoCuenta;

    @FXML
    private TextField txInformacionExtraCuenta;

    @FXML
    private TextField txNombreBanco;

    @FXML
    private TextField txNombreTitular;

    @FXML
    private TextField txNumeroCuenta;

    @FXML
    private TextField txValorDoR;

    @FXML
    private Label listListaCuentas;

    @FXML
    void crearBanco(ActionEvent event) {
        String nombreBanco = txNombreBanco.getText();
        if (!nombreBanco.isBlank()) {
            Banco.crearBancoNuevo(nombreBanco);
            actualizarListaCuentas();
        } else {
            System.err.println("Ingresa el nombre");
        }

    }

    @FXML
    void crearCuentaAhorros(ActionEvent event) {
        String nombre = txNombreTitular.getText();
        String apellido = txApellidoTitular.getText();
        String numeroCuenta = txNumeroCuenta.getText();
        String infoTexto = txInformacionExtraCuenta.getText();
        double info = Double.parseDouble(infoTexto);
        Ahorro.crearCuentaAhorro(nombre, apellido, numeroCuenta, info);
        actualizarListaCuentas();
        

    }

    @FXML
    void crearCuentaCorriente(ActionEvent event) {
        String nombre = txNombreTitular.getText();
        String apellido = txApellidoTitular.getText();
        String numeroCuenta = txNumeroCuenta.getText();
        String infoTexto = txInformacionExtraCuenta.getText();
        int info = Integer.parseInt(infoTexto);
        Corriente.crearCuentaCorriente(nombre, apellido, numeroCuenta, info);
        actualizarListaCuentas();
        
    }

    @FXML
    void depositar(ActionEvent event) {
        String codigo = txCodigoCuenta.getText();
        int valor = Integer.parseInt(txValorDoR.getText());
        for (CuentaBancaria cuenta : Banco.getListaCuentaBancarias()) {
            if (cuenta.getNumeroCuenta().equals(codigo)) {
                cuenta.depositar(valor);
                break;
            }
        }
        actualizarListaCuentas();
    }

    @FXML
    void retirar(ActionEvent event) {
        String codigo = txCodigoCuenta.getText();
        int valor = Integer.parseInt(txValorDoR.getText());
        for (CuentaBancaria cuenta : Banco.getListaCuentaBancarias()) {
            if (cuenta.getNumeroCuenta().equals(codigo)) {
                cuenta.retirar(valor);
                break;
         } 
    }
    actualizarListaCuentas();
    }
    
    private void actualizarListaCuentas() {
        StringBuilder listaCuentas = new StringBuilder();
        for (CuentaBancaria cuenta : Banco.getListaCuentaBancarias()) {
            listaCuentas.append(cuenta.getNombreTirular()).append(" ").append(cuenta.getApellidosTitular()).append(" ").append(cuenta.getNumeroCuenta()).append(" ").append(cuenta.getSaldo()).append(" ").append("\n");
        }
        listListaCuentas.setText(listaCuentas.toString());
    }
        
        
        
    
    @FXML
    void initialize() {

    }
}



