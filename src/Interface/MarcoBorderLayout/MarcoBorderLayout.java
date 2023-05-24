package Interface.MarcoBorderLayout;
// BorderLayout que contiene cinco botones.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoBorderLayout extends JFrame implements ActionListener {

    private final JButton botones[]; // arreglo de botones para ocultar porciones
    private static final String nombres[] = {"Hide North", "Hide South",
            "Hide East", "Hide West", "Hide Center"};
    private final BorderLayout esquema;

    // establece la GUI y el manejo de eventos
    public MarcoBorderLayout() {
        super("Demo BorderLayout");

        esquema = new BorderLayout(5, 5); // espacios de 5 píxeles
        setLayout(esquema);
        botones = new JButton[nombres.length];

        // crea objetos JButton y registra componentes de escucha para ellos
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }

        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
    }


    @Override
    public void actionPerformed(ActionEvent evento) {
        // comprueba el origen del evento y distribuye el panel de contenido de manera acorde
        for (JButton boton : botones) {
            if (evento.getSource() == boton)
                boton.setVisible(false); // oculta el botón oprimido
            else
                boton.setVisible(true); // muestra los demás botones
        }

        esquema.layoutContainer(getContentPane()); // distribuye el panel de contenido
    }
} // fin de la clase MarcoBorderLayout

