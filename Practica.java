import javax.swing.JOptionPane ;

public class Practica {
    public static void  main (String [] args) {
 ;      int dato ;
        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad :"));  
        if (dato<18) {
            JOptionPane.showMessageDialog(null,"Eres menor de edad");}
            else if (dato >18 && dato<66 ){
                JOptionPane.showMessageDialog(null,"Eres mayor de edad "); }
            else if (dato>67 ){
                JOptionPane.showMessageDialog(null,"Eres mayor de edad "); }
            else if (dato==67){
                JOptionPane.showMessageDialog(null,"SIX SEVEEEEEEN");}
            
            else {JOptionPane.showMessageDialog(null,"dato invalido ");} 
        




    
        

    }

}