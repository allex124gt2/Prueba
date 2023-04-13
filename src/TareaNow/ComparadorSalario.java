package TareaNow;

import java.util.Comparator;
/* Elaborado por Alejandro Martínez Faustino*/
public class ComparadorSalario implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2){
        if(empleado1.getSalario() < empleado2.getSalario()){
            return -1;
        }else if(empleado1.getSalario() > empleado2.getSalario()){
            return 1;
        }else{
            return 0;
        }
    }

}
