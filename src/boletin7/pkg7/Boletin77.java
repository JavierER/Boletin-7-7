
package boletin7.pkg7;
import javax.swing.JOptionPane;
/**
 *
 * @author Javii
 */
public class Boletin77 {

    
    public static void main(String[] args) {
        double lado,altura,radio,base,PI;
        JOptionPane.showMessageDialog(null,"Opcion 1, cuadrado ;Opcion 2, triangulo ;Opcion 3, circulo");
        String obx=JOptionPane.showInputDialog("Escoger");
        int opcion=Integer.parseInt(obx);
        
        switch(opcion){
            case 1: 
                Cuadrado c=new Cuadrado();
                lado= c.getLado();
                JOptionPane.showMessageDialog(null,"Area cuadrado = "+ c.areaCuadrado(lado));
                break;
            case 2: 
                Triangulo t=new Triangulo();
                base=t.getBase();
                altura=t.getAltura();
                
                JOptionPane.showMessageDialog(null,"Area tríangulo = "+t.areaTriangulo(base,altura));
            case 3: 
                Circulo r=new Circulo();
                radio=r.getRadio();
                PI=3.14;
                JOptionPane.showMessageDialog(null,"Area circulo = "+r.areaCirculo(radio, PI));
                
    }
    }
}
