import javax.swing.*;

public class Planeta {
    //Atributos del Planeta
    String nombrePlaneta;
    int cantidadSatelites;
    double masaKg;
    double volkmCubicos;

    public Planeta() {
        cantidadSatelites = 0;
        masaKg = 0.0;
        volkmCubicos = 0.0;

    }

    // Metodo para imprimir en pantalla los atributos
    public String detalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("El nombre del planeta es: " + this.nombrePlaneta);
        sb.append("\nLa cantidad de satelites son: " + this.cantidadSatelites);
        sb.append("\nLa masa (kg) del planeta es: " + this.masaKg);
        sb.append("\nEl volumen (km^3) del planeta es: " + this.volkmCubicos);
        return sb.toString();
        }

        //Metodo para llenar los datos
    public void fillPlaneta(){
        JOptionPane.showMessageDialog(null, "Ingrese los datos del planeta");
        nombrePlaneta = JOptionPane.showInputDialog("Ingrese el nombre del planeta: ");
        cantidadSatelites = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de satelites del planeta"));
        masaKg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la masa del planeta"));
        volkmCubicos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el volumen del planeta"));

    }


}


