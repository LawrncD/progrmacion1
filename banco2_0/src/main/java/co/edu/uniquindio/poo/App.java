package co.edu.uniquindio.poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * 
 *
 */
public class App extends JFrame {
    private JTextArea listaCuentasArea;

    public App() {
        // Configura el título de la ventana
        setTitle("Aplicación de Banco");

        // Configura el tamaño de la ventana
        setSize(600, 400);

        // Centro el panel en la mitad de la pantalla
        setLocationRelativeTo(null);

        // Configura la operación de cierre de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea un panel para agregar los elementos de la interfaz gráfica
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        // Crea un campo de texto para ingresar el nombre del banco
        JTextField nombreBancoField = new JTextField("Ingresa el nombre del banco", 20);
        panel.add(nombreBancoField);

        // Crea un área de texto para mostrar la lista de cuentas
        listaCuentasArea = new JTextArea(10, 30);
        listaCuentasArea.setEditable(false);
        panel.add(listaCuentasArea);

        // Crea un botón para crear el banco
        JButton botonCrearBanco = new JButton("Crear Banco");
        panel.add(botonCrearBanco);

        // Agrega un manejador de eventos al botón de crear el banco
        botonCrearBanco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreBanco = nombreBancoField.getText();
                JOptionPane.showMessageDialog(nombreBancoField, "Banco '" + nombreBanco + "' creado exitosamente!");
                Banco.crearBanco(nombreBanco);
            }
        });

        // creo un campo para añadir el nombre del titular
        JTextField nombreTitularField = new JTextField("Ingresa el nombre del titular",20);
        panel.add(nombreTitularField);

        // creo un campo para añadir el apellido del titular
        JTextField apellidoField = new JTextField("Ingresa el apellido del titular",20);
        panel.add(apellidoField);

        // creo un campo para añadir el numero de la cuenta
        JTextField numeroCuentaField = new JTextField("Ingresa el nuemro de la cuenta",20);
        panel.add(numeroCuentaField);

        // Crea un combo box para seleccionar la cuenta
        @SuppressWarnings("rawtypes")
        JComboBox tipoCuentaComboBox = new JComboBox<>(TipoCuenta.values());
        panel.add(tipoCuentaComboBox);

        // creo un campo para añadir el valor de sobregiro o interes de la cuenta
        JTextField sobregiro_interesField = new JTextField("Ingresa el sobregiro o interes",20);
        panel.add(sobregiro_interesField);

        // creo un boton para crear la cuenta bancaria
        JButton botonCrearCuenta = new JButton("Crear Cuenta");
        panel.add(botonCrearCuenta);

        // creo un campo para poder ingresar el valor a retirar o depositar
        JTextField valorretiroOdepositoFiel = new JTextField("Ingresa el valor ", 20);
        panel.add(valorretiroOdepositoFiel);

        // creo un campo para poner el codigo de la cuenta a la cual deposotar o retirar
        JTextField codigoRetiro_DepositoField = new JTextField("Ingresa el codigo de la cuenta ", 20);
        panel.add(codigoRetiro_DepositoField);

        // Creo el boton de retiro
        JButton botonDeposiButton = new JButton("Depositar");
        panel.add(botonDeposiButton);

        // creo el boton de deposito
        JButton botonRetiroButton = new JButton("Retirar");
        panel.add(botonRetiroButton);

        // Implementacion del boton registrar cuenta
        botonCrearCuenta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TipoCuenta tipoSeleccionado = (TipoCuenta) tipoCuentaComboBox.getSelectedItem();
                if (tipoSeleccionado == TipoCuenta.CORRIENTE) {
                    String nombreTitular = nombreTitularField.getText();
                    String apellidoTitular = apellidoField.getText();
                    String numeroCuenta = numeroCuentaField.getText();
                    int sobregiro = Integer.parseInt(sobregiro_interesField.getText());

                    Corriente.crearCuentaCorriente(nombreTitular, apellidoTitular, numeroCuenta, sobregiro);
                    JOptionPane.showMessageDialog(nombreBancoField, "'Cuenta Corriente creada exitosamente!");

                    actualizarListaCuentas();
                } else if (tipoSeleccionado == TipoCuenta.AHORRO) {
                    String nombreTitular = nombreTitularField.getText();
                    String apellidoTitular = apellidoField.getText();
                    String numeroCuenta = numeroCuentaField.getText();
                    double interes = Double.parseDouble(sobregiro_interesField.getText());

                    Ahorro.crearCuentaAhorro(nombreTitular, apellidoTitular, numeroCuenta, interes);
                    JOptionPane.showMessageDialog(nombreBancoField, "'Cuenta  ahorros creada exitosamente!");
                    actualizarListaCuentas();
                }

                // Creo la implementacion del boton deposito
                botonDeposiButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String codigo = codigoRetiro_DepositoField.getText();
                        int deposito = Integer.parseInt(valorretiroOdepositoFiel.getText());
                        for (CuentaBancaria cuenta : Banco.getListaCuentaBancarias()) {
                            if (cuenta.getNumeroCuenta().equals(codigo)) {
                                cuenta.depositar(deposito);
                                actualizarListaCuentas();
                            }
                        }

                    }
                });

                //creo la implementacion del boton retirar
                botonRetiroButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        String codigo = codigoRetiro_DepositoField.getText();
                        int deposito = Integer.parseInt(valorretiroOdepositoFiel.getText());
                        for (CuentaBancaria cuenta : Banco.getListaCuentaBancarias()) {
                                if (cuenta.getNumeroCuenta().equals(codigo)) {
                                    cuenta.retirar(deposito);
                                    actualizarListaCuentas();
                                }
                        } 
                    }
                });

            }
        });

        setVisible(true);
    }

    private void actualizarListaCuentas() {
        listaCuentasArea.setText("");
        for (CuentaBancaria cuenta : Banco.getListaCuentaBancarias()) {
            listaCuentasArea.append("Nombre Titular: " + cuenta.getNombreTirular() + "Apellido Titular: "
                    + cuenta.getApellidosTitular() + " Numero Cuenta: " + cuenta.getNumeroCuenta()
                    + " Saldo de la cuenta: " + cuenta.getSaldo() + "\n");

        }
    }

    public static void main(String[] args) {
        // Crea la interfaz gráfica
        new App();

    }
}
