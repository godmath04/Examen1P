import javax.swing.*;
;import java.math.MathContext;

public class Circulo {
    double radio;
    double arear;
    double perimetror;

    //Calculo del area
    public void calculosC(){
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo en cm"));
        arear = Math.PI*radio*radio;
        perimetror = Math.PI*2*radio;
    }
    public String infoCirculo(){
        StringBuilder sb = new StringBuilder();
        sb.append("El area del circulo es: " + this.arear);
        sb.append("\nEl perimetro del circulo es: " + this.perimetror);
        return sb.toString();
    }

}
