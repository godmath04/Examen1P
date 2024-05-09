import javax.swing.*;
import java.time.LocalDate;

public class Empleado {
    String identificador;
    String nombre;
    String apellido;
    double salario;
    LocalDate fechaIngreso;
    int aniosServicio;
    double prestaciones;
    int option;

    public void ingresoInformacion(){
        identificador = JOptionPane.showInputDialog("Ingrese su identificador: ");
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: "));
        fechaIngreso = LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha de ingreso: YYYY-MM-DD"));
        aniosServicio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus anios de servicio: " ));
    }

    // Calculo de prestaciones
    public double calPrestacioneS(){
        option = Integer.parseInt(JOptionPane.showInputDialog(null, "Sus ansios de servicio son: " + this.aniosServicio + "\nEs correcto?\n1.Si\n2.No"));
        if (option == 1) {
            prestaciones = (aniosServicio * 12.0 * salario) / 360.0;
        }else if (option == 2){
            aniosServicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus anios de servicio: " ));
            prestaciones = (aniosServicio * 12.0 * salario) / 360.0;
        }

        return prestaciones;

    }

    // Anios de servivcio

    //Mostrar informacion
    public String infoEmpleado(){
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Nombre: " + this.nombre);
        sb1.append("\nApellido: " + this.apellido);
        sb1.append("\nIdentificado: " + this.identificador);
        sb1.append("\nFecha de ingreso: " + this.fechaIngreso);
        sb1.append("\nAnios de servicio: " + this.aniosServicio);
        sb1.append("\nSalario:" + this.salario);
        sb1.append("\nPrestaciones: " + calPrestacioneS());
        return sb1.toString();
    }



}
