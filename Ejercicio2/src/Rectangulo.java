import javax.swing.*;

public class Rectangulo {
        double baseRec;
        double alturaRec;
        double areaRec;
        double perimetroRec;

        // Calculo area

        public void calculosRec() {
            baseRec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo en cm"));
            alturaRec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo en cm"));
            areaRec = baseRec * alturaRec;
            perimetroRec = 2.0 * (baseRec + alturaRec);

        }


        public String infoRec() {
            StringBuilder sb = new StringBuilder();
            sb.append("El area del rectangulo es: " + this.areaRec);
            sb.append("\nEl perimetro del rectangulo es: " + this.perimetroRec);
            return sb.toString();
        }
}
