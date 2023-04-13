package TareaNow;

import java.util.Comparator;
/* Elaborado por Alejandro Martínez Faustino*/
public class ComparadorDepartamentoPuesto implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        if (empleado1.getDepartamento().compareTo(empleado2.getDepartamento()) != 0) {
            return empleado1.getDepartamento().compareTo(empleado2.getDepartamento());
        }
        return empleado1.getPuesto().compareTo(empleado2.getPuesto());
    }
}
