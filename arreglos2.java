package arreglos2 ;

import java.util.Scanner;


/**
 *
 * @author Nilder
 */
public class arreglos2 {
    
    private static final int nombre=0;
    private static final int enero=1;
    private static final int febrero=2;
    private static final int marzo=3;
    
 

    /**
     *
     */
 
    private static String [][]comisones=new String [3][4];
     
    public static void CargarInfo(int fila){
    Scanner t= new Scanner(System.in);
    System.out.println("ingrese su nombre");
   comisones[fila][nombre]=t.nextLine();
    System.out.println("ingrese enero");
   comisones[fila][enero]=t.nextLine();
    System.out.println("ingrese febrero");
   comisones[fila][febrero]=t.nextLine();
    System.out.println("ingrese marzo");
   comisones[fila][marzo]=t.nextLine();
   
   
    }
    
    public static void imprimirDecorado(String[][] ma) {
        for (int x = 0; x < ma.length; x++) {
            System.out.print("|");
            for (int y = 0; y < ma[x].length; y++) {
                System.out.print(ma[x][y]);
                
                if (y != ma[x].length + 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
            
       } 
        for (int x = 0; x < ma.length; x++){
        int total=0;
        for (int y = 0; y < ma[x].length; y++){
            total+=ma.length;
        }
        System.out.print("\n la suma del mes de enero es  "+ total);
        
        }
    }
    
   
    private static void registro(){
    for (int i=0; i< comisones.length; i++){
        CargarInfo(i);
         
         }
    
    }
    
     public static void main(String[] args){
       
       registro();
       imprimirDecorado(comisones);
    
       
      
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

   

  

  
}