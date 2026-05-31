import javax.swing.JOptionPane;
public class Menu {
    public static void main(String[] args) {
        char val = ' ';
        char val6 = ' ';
        byte opc = 0;
        while (val !='s') {
            JOptionPane.showMessageDialog(null,"BIenvenido a la sesion de registro para ingresar al menu practico #2 \n " );
            String nombre=JOptionPane.showInputDialog("Porfavor ingrese solamente su  nombre :");
            String apellido = JOptionPane.showInputDialog("Porfavor ingrese su primer apellido");
            byte edad = Byte.parseByte(JOptionPane.showInputDialog("Porfavor ingrese su edad :"));
            int num = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su numero telefonico :"));
            JOptionPane.showMessageDialog(null, "Bienvenido al  cusrso de programacion orientada a objetos.\n" +" "+ nombre+" "+apellido+" "+"contamos con que presenta una edad de :" + " " + edad +" " +"años"+" "+"y en caso de contactarle seria por el numero telefonico: "+" "+ num);
            val = JOptionPane.showInputDialog("Los datos son correctos ( s/n )").charAt(0);

        }
        do {
            JOptionPane.showMessageDialog(null, "Bienvenido al menu de opciones \n 1.Calculador de numeros pares e impares\n 2.Calculador de numero entero \n 3.Ordenar de mayor a menor\n 4.Mostrar contador del 1 al 100\n 5.Calculador de numero positivo o negativo\n 6.Leer que numeros acaban en 2\n 7.Salir del menu");
           opc =Byte.parseByte(JOptionPane.showInputDialog("Ingrese la opcion del menu a la que quieres ingresar :"));
                switch (opc) {
                    case 1:

                        JOptionPane.showMessageDialog(null, "Bienvenido al modulo de numero pares e impares");
                        
                            int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desee calcular :"));
                            if (num1%2==0){
                                JOptionPane.showMessageDialog(null, "El numero "+num1+" "+ "es par");}
                                else {JOptionPane.showMessageDialog(null, "El numero "+ num1+" "+ " es impar");}

                            
                        break;
                    case 2 :
                        JOptionPane.showMessageDialog(null, "Bienvenido al modulo de numeros enteros");
                        float num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero para calcular si es entero"));
                        if (num2%1==0){
                             JOptionPane.showMessageDialog(null, "El numero "+num2+" "+ "es entero");}
                        
                            else {JOptionPane.showMessageDialog(null, "El numero "+num2+" "+ "no es entero ");}
                            break ;
                    case 3 :
                        float n1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero que desee comparar"));
                        float n2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero que desee comparar"));
                        float n3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer numero que desee comparar"));
                        if (n1>n2 && n1>n3){
                            JOptionPane.showMessageDialog(null, "El numero "+n1+" es el mayor");
                        }
                        else if (n2>n1 && n2>n3){
                             JOptionPane.showMessageDialog(null, "El numero "+n2+" es el mayor");
                            

                        }
                        else {
                            JOptionPane.showMessageDialog(null,"El numero "+n3+" es el mayor");}
                            break;
                    case 4 :
                        String resultado = " ";
                        for (int i =1;i<=100;i++)
                        resultado+= i + "\n ";
                        JOptionPane.showMessageDialog(null, "Los numeros del 1 al 100 son : "+resultado);
                        break;
                    case 5 :
                        JOptionPane.showMessageDialog(null,"Bievenido al modulo para calcular si un num es positivo o negativo");
                        float i=1;
                        while (i!=0){   
                            i=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el numero que desea calcular, para salir digite el numero 0"));
                            if (i>0){
                                JOptionPane.showMessageDialog(null, "El numero "+i+" es positivo");}
                            else if(i<0){
                                JOptionPane.showMessageDialog(null,"EL numero "+i+" es negativo");
                            }

                            else {
                                JOptionPane.showMessageDialog(null,"Has salido del modulo , gracias por utilizar");
                            }}
                        break;

                    case 6 :
                        JOptionPane.showMessageDialog(null, "BIenvenido al modulo de calculo de numeros terminamos en 2");
                        do {
                            int n6=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a calcular"));
                            if (n6%10==2){
                                JOptionPane.showMessageDialog(null,"El numero "+n6+" tiene terminacion en 2");}
                            else {
                                JOptionPane.showMessageDialog(null, "El numero "+n6+" no tiene terminacion en 2");
                            }
                            val6=JOptionPane.showInputDialog("Desea continuar calculando numeros?(s/n").charAt(0);}
                            while(val6!='n');
                        break;
                    case 7:
                            JOptionPane.showMessageDialog(null, "Gracias por utilizar\n Andrey Aguirre Sandino 2026\nIntroduccion a la programacion\nUniversidad FIdelitas\2026");
                            break;
                    default:
                                    JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                    

                }
                    

            } while(opc != 7);
            
        }

        
    }

        
        

      
        
    


