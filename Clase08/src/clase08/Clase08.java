package clase08;

import ar.com.KevinRios.java.utils.files.FileText;
import java.util.Arrays;

public class Clase08 {

    public static void main(String[] args) {
        //System.out.println(10/0);
        //System.out.println("Esta linea no se ejecuta.");
        
      
        /*
        try{
            System.out.println(10/0);
            System.out.println("Esta linea no se ejecuta.");
        }catch(Exception e){
            System.out.println("Ocurrio un error.");
            System.out.println(e);
        }finally{
            System.out.println("El programa termina normalmente");
        }
        System.out.println("Fin del programa.");
        */
        
        try {
            //GeneradorDeExcepciones.generar();
            //GeneradorDeExcepciones.generar(true);
            //GeneradorDeExcepciones.generar(null, 2);
            //GeneradorDeExcepciones.generar("Hola", 20);
            //GeneradorDeExcepciones.generar("22x");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        //System.out.println("Fin del programa.");
        
        //Captura personalizada de Exceptions
        try {
            //GeneradorDeExcepciones.generar();
            //GeneradorDeExcepciones.generar(true);
            //GeneradorDeExcepciones.generar(null, 2);
            //GeneradorDeExcepciones.generar("Hola", 20);
            //GeneradorDeExcepciones.generar("22x");
            //File file=new File("texto.txt");
            //FileReader in=new FileReader(file);
        }catch(ArithmeticException e){
            System.out.println("Division /0");
        }catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException ex){
            System.out.println("Indice fuera de rango.");
        }catch(NumberFormatException e){
            System.out.println("Formato de numero incorrecto.");
        }
        //catch(StringIndexOutOfBoundsException e){
        //    System.out.println("Indice fuera de rango.");
        //}
        catch(NullPointerException e){
            System.out.println("Puntero nulo.");
        }catch (Exception e) {
            System.out.println("Ocurrio un error no esperado.");
        }
        System.out.println("*********************************");
        //Uso de Exceptions para validar Reglas de negocio.
        Vuelo v1=new Vuelo("aer1234",100);
        Vuelo v2=new Vuelo("lan1111",100);
        
        try {
            v1.venderPasajes(30);
            v2.venderPasajes(10);
            v1.venderPasajes(40);
            v2.venderPasajes(20);
            v1.venderPasajes(40);       //lanza Exception
            v2.venderPasajes(10);       //esta venta no se realiza
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex);
        }
        System.out.println(v1);
        System.out.println(v2);
        
        System.out.println("*********************************");
        //String file="c:/texto.txt";       //absoluto de un disco
        String file="res/texto.txt";        //relativo al proyecto
        FileText fileText=new FileText(file);
        //fileText.print();
        fileText.setText("Curso de Java.\n");
        fileText.appendText("Primavera.\n");
        fileText.appendText("Verano.\n");
        fileText.appendText("Otoño.\n");
        fileText.appendText("Invierno.\n");
        fileText.addLine("Lunes");
        fileText.addLine("Martes");
        fileText.addLine("Miercoles");
        fileText.addLine("Jueves");
        fileText.addLine("Viernes");
        fileText.addLines(Arrays.asList("Rojo","Verde","Azul","Blanco","Negro"));
        fileText.addLine("Miercoles");
        fileText.addLine("Jueves");
        fileText.addLine("Viernes");
        fileText.remove("Rojo");
        
        //fileText.getLines().forEach(System.out::println);
        //fileText.getLinkedHashSetLines().forEach(System.out::println);
        fileText.getTreeSetLines().forEach(System.out::println);
        //System.out.println(fileText.getText());
        
    }
    
}
