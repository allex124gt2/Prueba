package TareaNow;

import java.util.Comparator;
/* Elaborado por Alejandro Martínez Faustino*/
public class ComparadorDepartamentoSalario implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        if (empleado1.getDepartamento().compareTo(empleado2.getDepartamento()) != 0) {
            return empleado1.getDepartamento().compareTo(empleado2.getDepartamento());
        }
        if (empleado1.getSalario() == empleado2.getSalario()) {
            return 0;
        } else if (empleado1.getSalario() > empleado2.getSalario()) {
            return 1;
        } else {
            return -1;
        }
    }
}
