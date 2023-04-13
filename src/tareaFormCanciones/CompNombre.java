package tareaFormCanciones;

import java.util.Comparator;

public class CompNombre implements Comparator<persona> {

    @Override
    public int compare(persona persona1, persona persona2) {
        return persona1.getNombre().compareTo(persona2.getNombre());
    }
}
