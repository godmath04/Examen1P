import javax.swing.*;

public class Triangulo {
    double base;
    double altura;
    double perimetroT;
    double areaT;

    // Calculo area

    public void calculosT(){
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo en cm"));
        base =Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo en cm"));
        areaT = (altura*base)/2;
        perimetroT = 3.0*base;

    }


    public String infoTriangulo(){
        StringBuilder sb = new StringBuilder();
        sb.append("El area del triangulo es: " + this.areaT);
        sb.append("\nEl perimetro del triangulo es: " + this.perimetroT);
        return sb.toString();
    }
}
