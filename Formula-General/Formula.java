import javax.swing.*;
/**
 * Clase Formula obtener la raíz con la fórmula general.
 * 
 * @author López Santiago Oscar  
 * @version 30/11/2019
 */
public class Formula
{
    //inicializar variables de instancia

    /**
     * Constructor de objetos de clase Contrasena
     * @param c El parametro c define el String que sera la contraseña 
     */

    /**
     * Este método nos arroja la raíz resultante de la fórmula general
     * @parem 
     * @return void
     */
    public static void Formula(){
        //pon tu código aquí
        double a=0,b=0,c=0;
        try{
            a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de a"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de b"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de c"));
        }catch(NumberFormatException miExcepcion){
            JOptionPane.showMessageDialog(null,"Dato ingresado invalido");
            return;
        }
        double raiz = b-(4*a*c);
        double x1, x2;
        if(a==0){
            JOptionPane.showMessageDialog(null,"el dividendo es 0 por lo tanto no se puede dividir");
            return;}
        if(raiz<0)   
            JOptionPane.showMessageDialog(null,"El resultado dentro de la raiz es negativa: "+raiz);
        else{
            x1=(-b+Math.pow(raiz, 0.5))/(2*a);
            x2=(-b-Math.pow(raiz, 0.5))/(2*a);
            String s = String.format("Los valores de x son:\nx1= %3.2f \nx2= %3.2f",x1,x2);
            JOptionPane.showMessageDialog(null, s);
        }
    } //Cierre del método
} //Cierre de la clase

