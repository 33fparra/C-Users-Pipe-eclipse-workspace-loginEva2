package com.loginEva2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Simple Login");
	    frame.setSize(300, 150);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new BorderLayout());

	    // Panel para los campos de entrada
	    JPanel panel = new JPanel();
	    panel.setLayout(new GridLayout(3, 2));

	    // Añadiendo componentes al panel
	    panel.add(new JLabel("Usuario:"));
	    JTextField usernameField = new JTextField();
	    panel.add(usernameField);

	    panel.add(new JLabel("Contraseña:"));
	    JPasswordField passwordField = new JPasswordField();
	    panel.add(passwordField);

	    JButton loginButton = new JButton("Ingresar");
	    panel.add(loginButton);

	    // Agrega el panel al frame
	    frame.add(panel, BorderLayout.CENTER);

	    // Acción del botón de login
	    loginButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            String username = usernameField.getText();
	            char[] password = passwordField.getPassword();
	            if(username.equals("admin") && new String(password).equals("password")) {
	                JOptionPane.showMessageDialog(frame, "Bienvenido!");
	            } else {
	                JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    });

	    // Mostrar la ventana
	    frame.setVisible(true);

	}

}
