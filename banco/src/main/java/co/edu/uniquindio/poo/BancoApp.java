package co.edu.uniquindio.poo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BancoApp extends JFrame {
    private Banco banco;
    private JTextField nombreBancoField;
    private JTextArea listaCuentasArea;
    private JTextField nombreTitularField;
    private JTextField apellidoTitularField;
    private JTextField numeroCuentaField;
    private JComboBox<TipoCuenta> tipoCuentaComboBox;
    private JTextField cantidadField;
    private JComboBox<CuentaBancaria> cuentaComboBox;

    public BancoApp() {
        // Configura el título de la ventana
        setTitle("Aplicación de Banco");

        // Configura el tamaño de la ventana
        setSize(600, 400);

        // Configura la operación de cierre de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea un panel para agregar los elementos de la interfaz gráfica
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        // Crea un campo de texto para ingresar el nombre del banco
        nombreBancoField = new JTextField(20);
        panel.add(nombreBancoField);

        // Crea un botón para crear el banco
        JButton botonCrearBanco = new JButton("Crear Banco");
        panel.add(botonCrearBanco);

        // Agrega un manejador de eventos al botón
        botonCrearBanco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearBanco();
            }
        });

        // Crea campos de texto para ingresar los detalles de la cuenta
        nombreTitularField = new JTextField(20);
        panel.add(nombreTitularField);

        apellidoTitularField = new JTextField(20);
        panel.add(apellidoTitularField);

        numeroCuentaField = new JTextField(20);
        panel.add(numeroCuentaField);

        // Crea un combo box para seleccionar el tipo de cuenta
        tipoCuentaComboBox = new JComboBox<>(TipoCuenta.values());
        panel.add(tipoCuentaComboBox);

        // Crea un botón para agregar la cuenta
        JButton botonAgregarCuenta = new JButton("Agregar Cuenta");
        panel.add(botonAgregarCuenta);

        // Agrega un manejador de eventos al botón
        botonAgregarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCuenta();
            }
        });

        // Crea un campo de texto para ingresar la cantidad a depositar o retirar
        cantidadField = new JTextField(20);
        panel.add(cantidadField);

        // Crea un combo box para seleccionar la cuenta
        cuentaComboBox = new JComboBox<>();
        panel.add(cuentaComboBox);

        // Crea un botón para depositar
        JButton botonDepositar = new JButton("Depositar");
        panel.add(botonDepositar);

        // Agrega un manejador de eventos al botón
        botonDepositar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositar();
            }
        });

        // Crea un botón para retirar
        JButton botonRetirar = new JButton("Retirar");
        panel.add(botonRetirar);

        // Agrega un manejador de eventos al botón
        botonRetirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retirar();
            }
        });

        // Crea un área de texto para mostrar la lista de cuentas
        listaCuentasArea = new JTextArea(10, 30);
        listaCuentasArea.setEditable(false);
        panel.add(listaCuentasArea);

        // Muestra la ventana
        setVisible(true);
    }

    private void crearBanco() {
        String nombreBanco = nombreBancoField.getText();
        if (!nombreBanco.isBlank()) {
            this.banco = new Banco(nombreBanco);
            JOptionPane.showMessageDialog(this, "Banco '" + nombreBanco + "' creado exitosamente!");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un nombre para el banco.");
        }
    }

    private void agregarCuenta() {
        if (banco != null) {
            String nombreTitular = nombreTitularField.getText();
            String apellidoTitular = apellidoTitularField.getText();
            String numeroCuenta = numeroCuentaField.getText();
            TipoCuenta tipoCuenta = (TipoCuenta) tipoCuentaComboBox.getSelectedItem();

            if (!nombreTitular.isBlank() && !apellidoTitular.isBlank() && !numeroCuenta.isBlank()) {
                CuentaBancaria cuenta = new CuentaBancaria(nombreTitular, apellidoTitular, numeroCuenta, tipoCuenta);
                banco.agregarCuenta(cuenta);
                cuentaComboBox.addItem(cuenta);
                actualizarListaCuentas();
                JOptionPane.showMessageDialog(this, "Cuenta agregada exitosamente!");
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, crea un banco primero.");
        }
    }

    private void depositar() {
        if (banco != null) {
            CuentaBancaria cuenta = (CuentaBancaria) cuentaComboBox.getSelectedItem();
            try {
                double cantidad = Double.parseDouble(cantidadField.getText());

                if (cuenta != null && cantidad > 0) {
                    banco.depositar(cuenta, cantidad);
                    actualizarListaCuentas();
                    JOptionPane.showMessageDialog(this, "Depósito realizado exitosamente!");
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, selecciona una cuenta y una cantidad válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, crea un banco y agrega una cuenta primero.");
        }
    }

    private void retirar() {
        if (banco != null) {
            CuentaBancaria cuenta = (CuentaBancaria) cuentaComboBox.getSelectedItem();
            try {
                double cantidad = Double.parseDouble(cantidadField.getText());

                if (cuenta != null && cantidad > 0) {
                    banco.retirar(cuenta, cantidad);
                    actualizarListaCuentas();
                    JOptionPane.showMessageDialog(this, "Retiro realizado exitosamente!");
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, selecciona una cuenta y una cantidad válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, crea un banco y agrega una cuenta primero.");
        }
    }

    private void actualizarListaCuentas() {
        listaCuentasArea.setText("");
        for (CuentaBancaria cuenta : banco.getListaCuentas()) {
            listaCuentasArea.append(cuenta.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        // Crea la interfaz gráfica
        new BancoApp();
    }
}
