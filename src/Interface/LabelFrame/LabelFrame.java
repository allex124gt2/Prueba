package Interface.LabelFrame;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {
    private final JLabel etiqueta1; // JLabel sólo con texto
    private final JLabel etiqueta2; // JLabel construida con texto y un icono
    private final JLabel etiqueta3; // JLabel con texto adicional e icono

    // El constructor de LabelFrame agrega objetos JLabel a JFrame
    public LabelFrame() {
        super("Prueba de JLabel");
        setLayout(new FlowLayout()); // establece el esquema del marco

        // Constructor de JLabel con un argumento String
        etiqueta1 = new JLabel("Imagen");
        etiqueta1.setToolTipText("Esto es etiqueta1");
        add(etiqueta1); // agrega etiqueta1 a JFrame

        // Constructor de JLabel con argumentos de cadena, Icono y alineación
        Icon insecto = new ImageIcon(getClass().getResource("insecto1.png"));
        etiqueta2 = new JLabel("Etiqueta con texto e icono", insecto,
                SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es etiqueta2");
        add(etiqueta2); // agrega etiqueta2 a JFrame
        etiqueta3 = new JLabel(); // constructor de JLabel sin argumentos
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(insecto); // agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3); // agrega etiqueta3 a JFrame
    }
} // fin de la clase LabelFrame


