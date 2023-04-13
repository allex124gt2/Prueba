package tareaFormCanciones;

import java.util.Comparator;

public class CompApe implements Comparator<persona> {
    @Override
    public int compare(persona persona1, persona persona2) {
        return persona1.getApellido().compareTo(persona2.getApellido());

    }
}
