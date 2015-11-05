
package boletin7.pkg7;

import javax.swing.JOptionPane;
/**
 *
 * @author Javii
 */
public class Circulo {
    double radio;
    
    static final double PI=3.14;
    
   
    
    public double areaCirculo(double radio,double PI){
    return PI*(Math.pow(radio, 2));
    }
    public double getRadio(){
    return (Double.parseDouble(JOptionPane.showInputDialog("Radio ")));
    }
}
