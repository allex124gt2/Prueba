package tareaFormCanciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class FormCanciones extends JFrame {
    DefaultListModel modelo = new DefaultListModel();
    ArrayList<String> listaSong = new ArrayList<>();

    public FormCanciones() {
        initComponents();
        listaSong.add("Frame of mind");
        listaSong.add("Digital fame");
        listaSong.add("Afterlife");
        listaSong.add("Couldn't tell");
        listaSong.add("Distant");
        listaSong.add("Not around");
        listaSong.add("Heaven sent");
        listaSong.add("Palace");
        listaSong.add("New person, Same old mistakes");
        listaSong.add("Show me how");
        llenarJlistSong();
    }

    public void llenarJlistSong() {
        modelo.removeAllElements();
        for (int i = 0; i < listaSong.size(); i++) {
            modelo.addElement(listaSong.get(i));
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
        lblTitulo.setText("Canciones");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(100, 60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);


        JList<Integer> JlistSong = new JList<Integer>();
        JlistSong.setPreferredSize(new Dimension(300, 500));
        JlistSong.setVisibleRowCount(10);
        JlistSong.setModel(modelo);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.BLUE);
        panelInferior.setLayout(new GridLayout(1, 1, 10, 10));
        add(panelInferior);
        panelInferior.add(add(new JScrollPane(JlistSong)));

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.BLACK);
        panelBotones.setLayout(new GridLayout(4, 2, 2, 2));
        panelInferior.add(panelBotones);


        JButton btnAgregar = new JButton("Agregar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnBorrar = new JButton("Borrar");
        JButton btnSalir = new JButton("Salir");


        btnAgregar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnAgregarActionPerformed(event);
                    }
                }
        );

        btnBuscar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnBuscarActionPerformed(event);
                    }
                }

        );

        btnBorrar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        btnBorrarActionPerformed(event);
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
        panelBotones.add(btnBuscar);
        panelBotones.add(btnBorrar);
        panelBotones.add(btnSalir);


    }



    private void btnSalirActionPerformed(ActionEvent event) {
        System.exit(0);
    }

    private void btnBorrarActionPerformed(ActionEvent event) {
        String nombreSong = JOptionPane.showInputDialog("Escribe un nombre a borrar: ");
        if (nombreSong.equals("") || nombreSong == null) {
            return;
        }
        Iterator<String> iterator = listaSong.iterator();
        while (iterator.hasNext()) {
            if (nombreSong.equals(iterator.next())) {
                iterator.remove();
                JOptionPane.showMessageDialog(this, "La canción se ha eliminado");
            }
        }
        llenarJlistSong();

    }

    private void btnBuscarActionPerformed(ActionEvent event) {
        String nombreSong = JOptionPane.showInputDialog("Escribe nombre a buscar: ");
        if (nombreSong.equals("") || nombreSong == null) {
            return;
        }
        if (listaSong.contains(nombreSong)) {
            JOptionPane.showMessageDialog(this, "Se encuentra la canción");
        } else {
            JOptionPane.showMessageDialog(this, "No se encuentra la canción");
        }
    }

    private void btnAgregarActionPerformed(ActionEvent event) {
        String nombreSong = JOptionPane.showInputDialog("Escribe un nombre: ");
        if (nombreSong.equals("") || nombreSong == null) {
        }
        listaSong.add(nombreSong);
        llenarJlistSong();

    }

    public static void main(String[] args) {
        new FormCanciones().setVisible(true);

    }


}
