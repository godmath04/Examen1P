import javax.swing.*;

public class Cuadrado {
    double lado;
    double area;
    double perimetro;

    // Calculo area

    public void calculos(){
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado en cm"));
        area = lado*lado;
        perimetro = 4.0*lado;

    }


    public String infoCuadrado(){
        StringBuilder sb = new StringBuilder();
        sb.append("El area del cuadrado es: " + this.area);
        sb.append("\nEl perimetro del cuadrado es: " + this.perimetro);
        return sb.toString();
    }
}
