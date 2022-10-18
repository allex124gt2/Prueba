package Interface.LabelFrame;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {
    private final JLabel etiqueta1; // JLabel sólo con texto
    private final JLabel etiqueta2; // JLabel construida con texto y un icono
    private final JLabel etiqueta3; // JLabel con texto adicional e icono

    // El constructor de LabelFrame agrega objetos JLabel a JFrame
    public LabelFrame() {
        super("JLabel Test");
        setLayout(new FlowLayout()); // establece el esquema del marco

        // Constructor de JLabel con un argumento String
        etiqueta1 = new JLabel("Image");
        etiqueta1.setToolTipText("This is label1");
        add(etiqueta1); // agrega etiqueta1 a JFrame

        // Constructor de JLabel con argumentos de cadena, Icono y alineación
        Icon insecto = new ImageIcon(getClass().getResource("imagenprueba.png"));
        etiqueta2 = new JLabel("Label with text and icon", insecto,
                SwingConstants.LEFT);
        etiqueta2.setToolTipText("This is label2");
        add(etiqueta2); // agrega etiqueta2 a JFrame
        etiqueta3 = new JLabel(); // constructor de JLabel sin argumentos
        etiqueta3.setText("Label with icon and text at the bottom");
        etiqueta3.setIcon(insecto); // agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("This is label3");
        add(etiqueta3); // agrega etiqueta3 a JFrame
    }
} // fin de la clase LabelFrame


