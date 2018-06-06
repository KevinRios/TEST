package clase07;

import ar.com.KevinRios.java.utils.files.FileText;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Clase07 {
    
    public static void main(String[] args) {
        
        /*
        try {
            System.out.println(10/0);
            System.out.println("esta linea no se ejecuta");
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            System.out.println(e);
        }finally{
            System.out.println(" el programa termina normalmente");
        }
        System.out.println(" fin del programa");
        */
        
        try {
            //GeneradorExcepciones.generar();
            //GeneradorExcepciones.generar(true);
            //GeneradorExcepciones.generar(null,1);
            // GeneradorExcepciones.generar("hola", 20);
            // GeneradorExcepciones.generar("22x");
                   
        } catch (Exception e) {           
            //e.printStackTrace();
            System.out.println(e);
        }
       // System.out.println("Fin del normalmente");
        
        
        // captura personalizada de excepciones
        
        try {
            //GeneradorExcepciones.generar();
            //GeneradorExcepciones.generar(true);
            //GeneradorExcepciones.generar(null,1);
            // GeneradorExcepciones.generar("hola", 20);
            // GeneradorExcepciones.generar("22x");
            
            File file = new File("texto.txt");
            FileReader in = new FileReader(file);
                   
        }
        catch(ArithmeticException e){
            System.out.println("Division /0");
        }catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException ex){
                System.out.println("fuera de rango");                
        }catch(NumberFormatException e){
            System.out.println("formato de numero incorrecto");
        }
        catch(NullPointerException e){
            System.out.println("puntero nulo");
        }catch (Exception e) {           
            System.out.println("ocurrio un error no esperado");
        }
        
        
        System.out.println("------------------------------------------");
        // uso de Exceptions para validar reglas de negocio
        
        Vuelo v1 = new Vuelo("arg123", 100);
        Vuelo v2 = new Vuelo("nor123", 100);
        
        try {
            v1.venderPasajes(30);
            v2.venderPasajes(10);
            v1.venderPasajes(40);
            v2.venderPasajes(20);
            v1.venderPasajes(40);   // lanza exception    
            v2.venderPasajes(10);   // esta venta no se realiza
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex);
        }
        
        System.out.println(v1);
        System.out.println(v2);
        
        
         System.out.println("------------------------------------------");
         
         String file="res/texto.txt";  //relativo al proyecto
         FileText fileText = new FileText(file);
         //fileText.print();
         
         fileText.setText("Curso de java. \n");
         fileText.appendText("Texto que se agrega con append \n");
         fileText.appendText("mas texto \n");
         fileText.addLine("lunes");
         fileText.addLine("martes");
         fileText.addLine("miercoles");
        
         fileText.addLines(Arrays.asList("Rojo","Verde","Azul","Blanco"));
         
         fileText.getLines().forEach(System.out::println);
         //System.out.println(fileText.getText());
    }
    
}
