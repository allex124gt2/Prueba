package tareaFormCanciones;


import java.util.Comparator;

public class ComparadorEdad implements Comparator<persona> {


    @Override
    public int compare(persona persona1, persona persona2) {
        if (persona1.getEdad() == persona2.getEdad()) {
            return 0;
        } else if (persona1.getEdad() > persona2.getEdad()) {
            return 1;
        } else {
            return -1;
        }

    }
}

