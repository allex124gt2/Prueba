package tareasLinkedList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
//Programa elaborado por Alejandro Martínez Faustino
public class LenguajesDeProgramacionMenu extends JFrame {
    static LinkedList<String> listaLenguajesProgramacion = new LinkedList<>();
    DefaultListModel modelo = new DefaultListModel();

    public LenguajesDeProgramacionMenu() {
        initComponents();
        listaLenguajesProgramacion.add("c++");
        listaLenguajesProgramacion.add("Java");
        listaLenguajesProgramacion.add("python");
        listaLenguajesProgramacion.add("Rust");
        listaLenguajesProgramacion.add("PHP");
        listaLenguajesProgramacion.add("Ruby");
        listaLenguajesProgramacion.add("Kotlin");

    }



    public void llenarJlistLenguajes() {
        modelo.removeAllElements();
        for (int i = 0; i < listaLenguajesProgramacion.size(); i++) {
            modelo.addElement(listaLenguajesProgramacion.get(i));
        }
    }

    public void initComponents() {
        JLabel lblTitulo = new JLabel();

        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1, 20, 20));

        lblTitulo.setFont(new Font("Dialog", 0, 40));
        lblTitulo.setText("Lenguajes de programación");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(100, 60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);


        JList<Integer> JlistLenguajes = new JList<Integer>();
        JlistLenguajes.setPreferredSize(new Dimension(300, 500));
        JlistLenguajes.setVisibleRowCount(10);
        JlistLenguajes.setModel(modelo);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.BLUE);
        panelInferior.setLayout(new GridLayout(1, 1, 10, 10));
        add(panelInferior);
        panelInferior.add(add(new JScrollPane(JlistLenguajes)));

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.BLACK);
        panelBotones.setLayout(new GridLayout(4, 2, 2, 2));
        panelInferior.add(panelBotones);


        JButton btnAgregar = new JButton("Añadir elemento");
        JButton btnAgregarF = new JButton("Añadir al final");
        JButton btnAgregarI = new JButton("Añadir al inicio");
        JButton btnMostrar = new JButton("Mostrar lista");
        JButton btnSalir = new JButton("Salir");

        btnAgregar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnAgregarActionPerformed(event);
                    }
                }
        );

        btnAgregarF.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnAgregarFActionPerformed(event);
                    }
                }
        );

        btnAgregarI.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnAgregarIActionPerformed(event);
                    }
                }
        );

        btnMostrar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnMostrarActionPerformed(event);
                    }
                }
        );

        btnSalir.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnSalirActionPerformed(event);
                    }
                }
        );

        panelBotones.add(btnAgregar);
        panelBotones.add(btnAgregarF);
        panelBotones.add(btnAgregarI);
        panelBotones.add(btnMostrar);
        panelBotones.add(btnSalir);



    }



    private void btnSalirActionPerformed(ActionEvent event) {
        System.exit(0);
    }

    private void btnMostrarActionPerformed(ActionEvent event) {
        llenarJlistLenguajes();

    }

    private void btnAgregarIActionPerformed(ActionEvent event) {
        String nombreLenguaje = JOptionPane.showInputDialog("Escribe un Lenguaje de programación para añadir al inicio: ");
        if (nombreLenguaje.equals("") || nombreLenguaje == null) {
        }
        listaLenguajesProgramacion.addFirst(nombreLenguaje);
        llenarJlistLenguajes();
    }

    private void btnAgregarFActionPerformed(ActionEvent event) {
        String nombreLenguaje = JOptionPane.showInputDialog("Escribe un Lenguaje de programación para añadir al final: ");
        if (nombreLenguaje.equals("") || nombreLenguaje == null) {
        }
        listaLenguajesProgramacion.addLast(nombreLenguaje);
        llenarJlistLenguajes();
    }

    private void btnAgregarActionPerformed(ActionEvent event) {
        String nombreLenguaje = JOptionPane.showInputDialog("Escribe un Lenguaje de programación para añadir: ");
        if (nombreLenguaje.equals("") || nombreLenguaje == null) {
        }
        listaLenguajesProgramacion.add(nombreLenguaje);
        llenarJlistLenguajes();
    }

    public static void main(String[] args) {
        new LenguajesDeProgramacionMenu().setVisible(true);
    }

}