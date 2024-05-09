import javax.swing.*;

/*Se requiere un programa que modele varias figuras geométricas: el círculo, el rectángulo, el cuadrado y el triángulo rectángulo.
• El círculo tiene como atributo su radio en centímetros.
• El rectángulo, su base y altura en centímetros.
• El cuadrado, la longitud de sus lados en centímetros.
• El triángulo, su base y altura en centímetros.
Se requieren métodos para:
• Determinar el área y el perímetro de cada figura geométrica.
FACULTAD DE INGENIERÍA Y CIENCIAS APLICADAS
o Circulo: Área = Pi * radio2
 Perímetro = 2 * Pi * radio
o Rectángulo: Área = base * altura Perímetro = 2(base + altura)
o Cuadrado: Área = lado2
 Perímetro = 4(lado)
o Triangulo: Área = (base * altura)/2 Perímetro = 3(base)
Se debe desarrollar una clase con un método main para crear las cuatro figuras y probar los métodos
respectivos.

* */
public class Main {
    public static void main(String[] args) {

        // Variables
        int option;

        //Objetos
        Cuadrado cuadradito = new Cuadrado();
        Circulo circulito = new Circulo();
        Rectangulo rectangulito = new Rectangulo();
        Triangulo triangulito = new Triangulo();

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la figura que desea area y perimetro\n1.Cuadrado\n2.Circulo\n3.Triangulo\n4.Rectangulo\n5.Salir"));
            if (option != 5) {

                switch (option) {
                    //Calculos del cuadrado
                    case 1:
                        cuadradito.calculos();
                        JOptionPane.showMessageDialog(null, cuadradito.infoCuadrado());
                        break;
                    case 2:
                        // Calculos del circulo
                        circulito.calculosC();
                        JOptionPane.showMessageDialog(null, circulito.infoCirculo());
                        break;
                    case 3:
                        // Calculos tirangulo
                        triangulito.calculosT();
                        JOptionPane.showMessageDialog(null, triangulito.infoTriangulo());
                        break;
                    case 4:
                        //Calculos del rectangulo
                        rectangulito.calculosRec();
                        rectangulito.infoRec();
                        break;

                }


            }
        } while (option != 5);

    }
}