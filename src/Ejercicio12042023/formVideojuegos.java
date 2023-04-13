package Ejercicio12042023;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class formVideojuegos extends JFrame {
    archivo archivox = new archivo("ventas_videojuegos.txt");
    List<videojuegos> listaVideojuegos = archivox.leerDeArchivo();
    List<videojuegos> listaFiltro = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();

    public formVideojuegos() {
        initComponents();
        llenarTabla(listaVideojuegos);
    }


    private void llenarTabla(List<videojuegos> listaVideojuegos) {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }

        Object[] fila = new Object[10];
        for (videojuegos aux : listaVideojuegos) {
            fila[0] = aux.getIndice();
            fila[1] = aux.getTitulo();
            fila[2] = aux.getPlataforma();
            fila[3] = aux.getAnio();
            fila[4] = aux.getGenero();
            fila[5] = aux.getPublisher();
            fila[6] = aux.getVentasNa();
            fila[7] = aux.getVentasEu();
            fila[8] = aux.getVentasJp();
            fila[9] = aux.getVentasGl();
            model.addRow(fila);
        }
    }


    private void initComponents() {

        JPanel panel = new JPanel(new BorderLayout());
        JPanel panelTabla = new JPanel(new BorderLayout());
        JPanel botones = new JPanel(new GridLayout(3, 3));


        JButton btnRegistros = new JButton("Mostrar los registros");
        btnRegistros.addActionListener(e -> {
            llenarTabla(listaVideojuegos);
            setTitle("Videojuegos");
        });
        botones.add(btnRegistros);


        JTable table = new JTable(model);
        model.addColumn("Índice");
        model.addColumn("Título");
        model.addColumn("Plataforma");
        model.addColumn("Año");
        model.addColumn("Género");
        model.addColumn("Publisher");
        model.addColumn("VentasNA");
        model.addColumn("VentasEU");
        model.addColumn("VentasJP");
        model.addColumn("VentasGL");

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelTabla.add(table, BorderLayout.CENTER);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);


        panel.add(botones, BorderLayout.NORTH);
        panel.add(panelTabla, BorderLayout.CENTER);

        pack();
        setContentPane(scrollPane);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000,600);
        setTitle("Videojuegos");
        setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        new formVideojuegos().setVisible(true);
    }

}
