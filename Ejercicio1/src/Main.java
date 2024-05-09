import javax.swing.*;

/*Ejercicio 1
Se requiere un programa que modele el concepto de un planeta del sistema solar
Un planeta tiene los siguiente atributos
Nombre tipo String
Cantidad de satelitos de tipo int con valor inicial de cero
Masa en kilogramos de tipo double con valor inicial de cero
Volumen en kilómetros cúbicos de tipo double con valor inicial de cero

La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
La clase debe incluir los siguientes métodos:
• Definir un método que imprima en pantalla los valores de los atributos del objeto.
En un método main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.

* */
public class Main {
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta();
        planeta1.fillPlaneta();
        JOptionPane.showMessageDialog(null, planeta1.detalles());

    }
}