import javax.swing.*;

/**
 * ELABORADO POR LUIS PINEDA
 * Definir una clase Empleado que tiene como atributos: identificador, nombre, apellidos, salario, fecha
 * de ingreso y años de servicio.
 * La aplicación debe permitir que se modifique los años de servicio y calcule las prestaciones. Para
 * calcular las prestaciones se utilizar la formular p = ((a * 12) * s )/360 (p: prestaciones, a: antigüedad
 * (años de servicio), s: salario).
 */
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.ingresoInformacion();
        JOptionPane.showMessageDialog(null, empleado1.infoEmpleado());
    }
}