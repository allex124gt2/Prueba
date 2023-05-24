package TareaNow;

import java.util.Comparator;
/* Elaborado por Alejandro Martínez Faustino*/
public class ComparadorDepartamento implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        return empleado1.getDepartamento().compareTo(empleado2.getDepartamento());
    }
}
