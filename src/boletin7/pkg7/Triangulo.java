
package boletin7.pkg7;

import javax.swing.JOptionPane;
/**
 *
 * @author Javii
 */
public class Triangulo {
    double base,altura;
    
    
    
    public double areaTriangulo(double base,double altura){
    return (base*altura)/2;
    }
    public double getBase(){
    return (Double.parseDouble(JOptionPane.showInputDialog("Base ")));
       
    }
    public double getAltura(){
    return(Double.parseDouble(JOptionPane.showInputDialog("Altura")));
    }
}
