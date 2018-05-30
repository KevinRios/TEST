package clase05;

public class Clase05 {

    public static void main(String[] args) {

        System.out.println("----- Clase Object -------");

        class X1 {

            int dato;

            // constructor vacio
            public X1() {
            }

            //constructor con parametros
            public X1(int dato) {
                this.dato = dato;
            }

            @Override
            public String toString() {
                return this.dato + "";
            }

            @Override
            public boolean equals(Object obj) {

                if (!(obj instanceof X1)) {
                    return false;
                }
                return this.toString().equals(obj.toString());

            }

            @Override
            public int hashCode() {
                return toString().hashCode();
            }

        }
        class X2 extends X1 {
        }
        System.out.println(X2.class.getName());

        X2 x2 = new X2();
        System.out.println(x2.getClass().getName());
        System.out.println(x2.getClass().getSimpleName());
        System.out.println(x2.getClass().getSuperclass().getSimpleName());
        System.out.println(x2.getClass().getSuperclass().getSuperclass().getName());
        System.out.println(x2.getClass().getSuperclass().getSuperclass().getSuperclass());

        /* al igualar variables --> distinto comportamiento
         con datos primitivos se crea una copia (un lugar en memoria distinto)
         con objects, se apunta solamente, se usa el mismo lugar de memoria
        esto es peligroso xq hay dos variables apuntando y que pueden modificar lo mismo
         */
        X1 xx1 = new X1(2);
        X1 xx2 = xx1;
        X1 xx3 = new X1(2);
        X1 xx4 = new X1(3);
        String xx5 = "2";

        /* hashCode
            codigo(id) que le pone java a cada objeto para identificarlo
         */
        System.out.println("----- hashCode -------");
        System.out.println("xx1.hashCode()=" + xx1.hashCode());
        System.out.println("xx2.hashCode()=" + xx2.hashCode());
        System.out.println("xx3.hashCode()=" + xx3.hashCode());
        System.out.println("xx4.hashCode()=" + xx4.hashCode());
        System.out.println("xx5.hashCode()=" + xx5.hashCode());

        System.out.println("----- equals -------");
        System.out.println("xx1.equals(xx1)=" + xx1.equals(xx1));
        System.out.println("xx1.equals(xx2)=" + xx1.equals(xx2));
        System.out.println("xx1.equals(xx3)=" + xx1.equals(xx3));
        System.out.println("xx1.equals(xx4)=" + xx1.equals(xx4));
        System.out.println("xx1.equals(xx5)=" + xx1.equals(xx5));

        // Clase String
        System.out.println("----- Clase String -------");
        String cadena1 = "Soy una cadena de texto";
        String cadena2 = new String("Hola");
        char[] vector = {'h', 'o', 'l', 'a'};
        String cadena3 = new String(vector);

        //  metodos propios de la clase String
        // .lenght --> devuelve la longitud        
        System.out.println(cadena1.length());
        // .subString --> acorta la cadena , o la muestra en un rango 
        // desde el indice 10 en adelante
        System.out.println(cadena1.substring(10));
        // entre el 10 y el 15
        System.out.println(cadena1.substring(10, 15));
        // .toLowerCase--> todo a minuscula ;  .toUpperCase --> todo a mayuscula
        System.out.println(cadena1.toLowerCase());
        System.out.println(cadena1.toUpperCase());
        //.replace --> cambia la letra indicada por la otra
        System.out.println(cadena1.replace('a', 'A'));
        //.contains --> devuelve true o false si esta ese valor en la cadenas
        System.out.println(cadena1.contains("hola"));
        System.out.println(cadena1.contains("cadena"));

        System.out.println("\t");

        String texto = "";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "h";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "o";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "l";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "a";
        System.out.println(texto + "\t" + texto.hashCode());
        // cada vez que se cambia algo de un String, java genera un nuevo object

        // Clase StringBuffer y StringBuilder
        // hacen lo mismo, builder es la mejora
        //cada vez que modifico el string, no cambia el objeto
        System.out.println("\t");
        System.out.println("----- StringBuilder -------");
        StringBuilder str = new StringBuilder();
        System.out.println(str.toString() + "\t" + str.hashCode());
        str.append("h");
        System.out.println(str.toString() + "\t" + str.hashCode());
        str.append("o");
        System.out.println(str.toString() + "\t" + str.hashCode());
        str.append("l");
        System.out.println(str.toString() + "\t" + str.hashCode());
        str.append("a");
        System.out.println(str.toString() + "\t" + str.hashCode());

        /* Clase System
        atributos out,err,in
        out: proporciona un stream sincronizado de salida a consola
        salen en el orden que se pidio
        err: proporciona un stream NO sincronizado de salida a consola
        in: proporciona un stream de entrada a consola
         */
        System.out.println("\t");
        System.out.println("----- Clase System -------");

        System.out.println("hola01");
        System.out.println("hola02");
        System.out.println("hola03");
        System.out.println("hola04");
        System.out.println("hola05");
        System.out.println("hola06");
        System.out.println("hola07");
        System.out.println("hola08");
        System.out.println("hola09");
        System.out.println("hola10");
        System.out.println("hola11");
        System.out.println("hola12");
        System.out.println("hola13");
        System.out.println("hola14");
        System.out.println("hola15");
        System.out.println("hola16");
        System.out.println("hola17");
        System.out.println("hola18");
        System.out.println("hola19");
        System.out.println("hola20");
        // al usar err pido que lo imprima ya, sin esperar a la cola de trabajo
        System.err.println("Ocurrio un error.");
        
        // Metodo exit
        // 0 --> no hubo error
        //System.exit(0);
        //System.out.println("asd");
        
        
        // Metodo getProperties
        // devuelve un diccionario de propiedades 
        System.out.println(System.getProperties());
        
        System.getProperties().forEach((k,v)->System.out.println(k+": "+v));
        // metodo getProperty
        // obtengo una propiedad por separado
        System.out.println("--------------");
        System.out.println(System.getProperty("user.name"));
        
        // metodo getenv
        // devuelve otras variables de entorno
        System.getenv().forEach((k,v)->System.out.println(k+":"+v));
        System.out.println("---------");
        System.out.println(System.getenv("PROCESSOR_IDENTIFIER"));
        
    }

}
