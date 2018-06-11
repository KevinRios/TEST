package clase08;

public class GeneradorExcepciones {
   public static void generar(){
       int[] vector = new int [5];
       vector [10]=1;
   } 
   
   
    public static void generar (boolean x){
        if(x){
           System.out.println(10/0);
        }
    }
    
    public static void generar(String nro){
        int n= Integer.parseInt(nro);
    }
               
    public static void generar(String texto, int pos){
        System.out.println(texto.charAt(pos));
    }
   
}
