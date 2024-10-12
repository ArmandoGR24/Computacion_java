package org.codigomaestro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    private JTextField pantalla;
    private double numero1;
    private double numero2;
    private char operador;

    public GUI() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Pantalla
        pantalla = new JTextField();
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);

        // Panel de botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Botones
        String[] botones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.addActionListener(this);
            panel.add(boton);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
            pantalla.setText(pantalla.getText() + comando);
        } else if (comando.charAt(0) == 'C') {
            pantalla.setText("");
        } else if (comando.charAt(0) == '=') {
            numero2 = Double.parseDouble(pantalla.getText());
            try {
                switch (operador) {
                    case '+':
                        pantalla.setText(String.valueOf(numero1 + numero2));
                        break;
                    case '-':
                        pantalla.setText(String.valueOf(numero1 - numero2));
                        break;
                    case '*':
                        if (numero2 == 0) {
                            throw new ArithmeticException("Multiplicación por cero");
                        }
                        pantalla.setText(String.valueOf(numero1 * numero2));
                        break;
                    case '/':
                        if (numero2 == 0) {
                            throw new ArithmeticException("División por cero");
                        }
                        pantalla.setText(String.valueOf(numero1 / numero2));
                        break;
                }
            } catch (ArithmeticException ex) {
                pantalla.setText("Error: " + ex.getMessage());
            }
        } else {
            if (!pantalla.getText().isEmpty()) {
                numero1 = Double.parseDouble(pantalla.getText());
                operador = comando.charAt(0);
                pantalla.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUI calc = new GUI();
            calc.setVisible(true);
        });
    }
}