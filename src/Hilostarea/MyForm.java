package Hilostarea;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class MyForm extends JFrame implements Runnable {
    private JTextArea textArea;
    private ArrayList<String> dictionary;

    public MyForm() {
        super("Formulario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);


        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(textArea, BorderLayout.CENTER);


        dictionary = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("dict.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                dictionary.add(line.trim());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error cargando el diccionario: " + e.getMessage());
            System.exit(1);
        }


        Thread saveThread = new Thread(this);
        saveThread.start();


        Thread spellCheckThread = new Thread(new SpellCheckRunnable());
        spellCheckThread.start();


        try {
            BufferedReader reader = new BufferedReader(new FileReader("savedText.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
        }
        setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(5000);
                BufferedWriter writer = new BufferedWriter(new FileWriter("savedText.txt"));
                writer.write(textArea.getText());
                writer.close();
            }
        } catch (InterruptedException e) {
        } catch (IOException e) {
            System.out.println("Error al guardar el texto como archivo: " + e.getMessage());
            System.exit(1);
        }
    }


    private class SpellCheckRunnable implements Runnable {
        private boolean isMisspelled = false;

        public void run() {
            try {
                while (true) {
                    Thread.sleep(60000);
                    String text = textArea.getText();
                    String[] words = text.split("\\s+");
                    boolean hasMisspellings = false;
                    for (String word : words) {
                        if (!dictionary.contains(word)) {
                            hasMisspellings = true;
                            break;
                        }
                    }
                    if (hasMisspellings) {
                        if (!isMisspelled) {
                            isMisspelled = true;
                            textArea.setBackground(Color.RED);
                        }
                    } else {
                        if (isMisspelled) {
                            isMisspelled = false;
                            textArea.setBackground(Color.WHITE);
                        }
                    }
                }
            } catch (InterruptedException e) {
            }
        }
    }


    public static void main(String[] args) {
        new MyForm();
    }
}

