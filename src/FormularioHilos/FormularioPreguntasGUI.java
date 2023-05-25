package FormularioHilos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class FormularioPreguntasGUI extends JFrame {
    private Map<String, String> questions;
    private Map<String, String> answers;
    private JLabel preguntaLabel;
    private JTextField respuestaTextField;
    private JButton siguienteButton;
    private JLabel resultadoLabel;
    private StringBuilder resultados;

    private int currentQuestionIndex;

    public FormularioPreguntasGUI() {
        questions = new HashMap<>();
        questions.put("1", "Anne is Paul's __________");
        questions.put("2", "Jason and Emily are their __________");
        questions.put("3", "Paul is Anne's __________");
        questions.put("4", "Jason is Anne's __________");
        questions.put("5", "Emily is Paul's __________");
        questions.put("6", "Jason is Emily's __________");
        questions.put("7", "Emily is Jason's __________");
        questions.put("8", "Paul and Anne are Jason's __________");

        answers = new HashMap<>();
        answers.put("1", "wife");
        answers.put("2", "children");
        answers.put("3", "husband");
        answers.put("4", "son");
        answers.put("5", "daughter");
        answers.put("6", "brother");
        answers.put("7", "sister");
        answers.put("8", "parents");

        preguntaLabel = new JLabel();
        respuestaTextField = new JTextField(20);
        siguienteButton = new JButton("Siguiente");
        resultadoLabel = new JLabel();
        resultados = new StringBuilder();

        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarRespuesta();
                mostrarSiguientePregunta();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(preguntaLabel);
        add(respuestaTextField);
        add(siguienteButton);
        add(resultadoLabel);


        setLocationRelativeTo(null);
        currentQuestionIndex = 1;
        mostrarSiguientePregunta();

        setPreferredSize(new Dimension(650, 80));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

    }

    private void mostrarSiguientePregunta() {
        if (currentQuestionIndex <= questions.size()) {
            String question = questions.get(String.valueOf(currentQuestionIndex));
            preguntaLabel.setText("Pregunta " + currentQuestionIndex + ": " + question);
            respuestaTextField.setText("");
            resultadoLabel.setText("");
        } else {
            preguntaLabel.setText("¡Has respondido todas las preguntas!");
            respuestaTextField.setEnabled(false);
            siguienteButton.setEnabled(false);
            mostrarResultados();
        }
    }



    private void verificarRespuesta() {
        String userAnswer = respuestaTextField.getText();
        String correctAnswer = answers.get(String.valueOf(currentQuestionIndex));
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            resultados.append("Pregunta ").append(currentQuestionIndex).append(": Correcta\n");
        } else {
            resultados.append("Pregunta ").append(currentQuestionIndex).append(": Incorrecta (").append(userAnswer).append("). La Respuesta correcta es: ").append(correctAnswer).append("\n");
        }
        currentQuestionIndex++;
    }





    private void mostrarResultados() {
        JTextArea resultadosTextArea = new JTextArea(resultados.toString());
        resultadosTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadosTextArea);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        JOptionPane.showMessageDialog(this, scrollPane, "Resultados", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularioPreguntasGUI().setVisible(true);
            }
        });
    }
}


