package Interface.MarcoGridLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// GridLayout que contiene seis botones.

public class MarcoGridLayout extends JFrame implements ActionListener {
    private final JButton[] botones; // arreglo de botones
    private static final String[] nombres =
            {"one", "two", "three", "four", "five", "six"};
    private boolean alternar = true; // alterna entre dos esquemas
    private Container contenedor; // contenedor del marco
    private GridLayout cuadricula1; // primer objeto GridLayout
    private GridLayout cuadricula2; // segundo objeto GridLayout

    // constructor sin argumentos
    public MarcoGridLayout() {
        super("Demo GridLayout");
        cuadricula1 = new GridLayout(2, 3, 5, 5); // 2 por 3; espacios de 5
        cuadricula2 = new GridLayout(3, 2); // 3 por 2; sin espacios
        contenedor = getContentPane();
        setLayout(cuadricula1);
        botones = new JButton[nombres.length];

        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this); // registra componente de escucha
            add(botones[cuenta]); // agrega boton a objeto JFrame
        }
    }

    // maneja eventos de boton, alternando entre los esquemas
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (alternar) // establece esquema con base en alternar
            contenedor.setLayout(cuadricula2);
        else
            contenedor.setLayout(cuadricula1);

        alternar = !alternar;
        contenedor.validate(); // redistribuye el contenedor
    }
} // fin de la clase MarcoGridLayout

