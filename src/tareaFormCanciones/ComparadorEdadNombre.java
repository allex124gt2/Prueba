package tareaFormCanciones;



import java.util.Comparator;

public class ComparadorEdadNombre implements Comparator<persona> {


    @Override
    public int compare(persona persona1, persona persona2) {
        if (persona1.getEdad()>persona2.getEdad()){
         return 1;
        }else if(persona1.getEdad()<persona2.getEdad()){
            return -1;
        }
        return persona1.getNombre().compareTo(persona2.getNombre());
    }
}
