
import javax.swing.JOptionPane;



public class Switch {
    public static void main (String [] args){
        JOptionPane.showMessageDialog(null,"BIenvenido al menu \n 1.MOdulo de citas medias \n 2.Urgencias \n 3.Farmacia \n  Salir.");
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null ,"Ingrese su opcion de preferencia :"))   ;
 
        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null,"INgresando a portal de citas medicas");
                int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"INgrese la edad del paciente"));
                if (edad<=12){
                    JOptionPane.showMessageDialog(null, "Redirigiendo a pediatria");}
                    else 
                         JOptionPane.showMessageDialog(null, "Redireccionando a medicina general");

                    
                       
                
;               
            case 2 :
                JOptionPane.showMessageDialog(null , "INgresando a portal de urgencias");
                break ;
            case 3:
                JOptionPane.showMessageDialog(null, "Ingresando a portal de farmacia");
                break ;
            case 4 :
                    JOptionPane.showMessageDialog(null, "Has salido del sistema");
                    break ;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida nigga, ingrese otra");
                
        }   }      }
        
//cambio


