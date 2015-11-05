
package boletin7.pkg7;

import javax.swing.JOptionPane;
/**
 *
 * @author Javii
 */
public class Cuadrado {
    double lado;
    public Cuadrado(){
    this.lado=lado;
    }
    public double getLado(){
    return (Double.parseDouble(JOptionPane.showInputDialog("Lado ")));
    }
    
    public double areaCuadrado(double lado){
        return Math.pow(lado,2);
    }
}
