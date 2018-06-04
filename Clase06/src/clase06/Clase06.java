package clase06;

import java.util.*;


public class Clase06 {
    
    public static void main(String[] args) {
        // collections
        
        //vector
        Auto[] autos = new Auto [4];
        autos[0] = new Auto("fiat", "qwe", "rojo");
        autos[1] = new Auto("fordc", "asd", "azul");
        autos[2] = new Auto("vw", "zxc", "verde");
        autos[3] = new Auto("peugeot", "uiop", "blanco");
        
        
        // distintas formas de recorrer la lista
        
        //recorrido con indices
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }
        
        // recorrido con foreach
        for (Auto auto : autos) {
            System.out.println(auto);
        }
        System.out.println("--------");  
        // recorrido java8
        Arrays.asList(autos).forEach(item->System.out.println(item));
        
        
        System.out.println("------");
        Arrays.asList(autos).forEach(System.out::println);
        
        // Interface List
        
        // Lista tipo Object
        List lista = new ArrayList();
        lista.add(new Auto("ford", "vbnm", "blanco"));
        lista.add(new Auto("vw", "c4", "verde"));
        lista.add(new Auto("citroen", "rtyu", "azul"));
        lista.add("hola");
        lista.add(23);
        
        // copiar los autos de Autos en la lista
        /*
        for (Object object : lista) {
            System.out.println(object);
            
        }
        */
        /*
        lista.addAll(Arrays.asList(autos));
        */
        //recorrido con indices
        /*
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        */
        System.out.println("---------------");
       
        // redocrrido java8
        lista.forEach( System.out::println);
        
        
        // uso de Gemerocs<>
        List<Auto> lista2 = new ArrayList();
        lista2.add(new Auto("Fiat", "Duna", "Blanco"));
        lista2.add(new Auto("asdkjhkio", "asdcsvfd", "fdghdfvds"));
                
        Auto auto1 = (Auto) lista.get(0); // se castea xq java no sabe bien lo que hay 
        Auto auto2 =  lista2.get(0);
        /*
        for(Object obj:lista){
            if(obj instanceof Auto){
                lista2.add((Auto)obj);  
            }
        }
        }*/
        // recorrido lista 2
        System.out.println("------");
        lista2.forEach(System.out::println);
        
        System.out.println("---------");
        System.out.println("interface set");
         // Interface set
         Set<Auto> set;
         
         // implementacion HashSet
         // es la mas veloz de todas, no garantiza el odren de los elementos
        set = new HashSet();
        set.addAll(lista2);
        set.add(new Auto("Fiat", "Duna", "Blanco"));
        set.forEach(System.out::println);
        
        
        // implementacion LinkedHashSet
        // Almacena los elementos en una lista enlazada, por orden de ingreso
        
        set = new LinkedHashSet();
        set.addAll(lista2);
        set.add(new Auto("Fiat", "Duna", "Blanco"));
        set.forEach(System.out::println);
        
        // implementacion TreeSet
        // Almacena los elementos en un arbol por orden natural
        System.out.println("------");
        set = new TreeSet();
        set.addAll(lista2);
        set.add(new Auto("Fiat", "Duna", "Blanco"));
        set.forEach(System.out::println);
        
        System.out.println("---------");
        System.out.println("pilas");
        // Pilas Stack LIFO Last In First Out
        Stack<Auto> pilaAutos = new Stack();
        // con metodo push apilo un elemento en la lista
        pilaAutos.push(new Auto("Chevrolet", "Onix", "Gris"));
        pilaAutos.addAll(lista2);
        System.out.println("Longitud de pila= "+ pilaAutos.size());
        while (!pilaAutos.isEmpty()) {
            // metodo pop desapila un elemento y lo devuelve
            System.out.println(pilaAutos.pop());
        }
        
        // clase ArrayDeque colas
        System.out.println("---------");
        System.out.println("pilas");
        
        Queue<Auto> colaAutos = new ArrayDeque<>();
        // metodo offer() encola un elemento
        colaAutos.offer(new Auto("Renault", "Duster", "Bordo"));
        colaAutos.addAll(lista2);
        System.out.println("Longitud de cola= "+ colaAutos.size());
        while (!colaAutos.isEmpty()) {
            //poll descola un elemento
            System.out.println(colaAutos.poll());
        }
        System.out.println("Longitud de cola= "+ colaAutos.size());
        
        // interfaz map
        System.out.println("----------------------");
        System.out.println("interfaz map");
        
        System.out.println("HashMap");
        Map<String, String> mapaSemana = new HashMap();
        // implementacion HashMap, es la mas veloz, no garantiza el orden
        mapaSemana.put("lu", "lunes");
        mapaSemana.put("ma", "martes");
        mapaSemana.put("mi", "miercoles");
        mapaSemana.put("ju", "jueves");
        mapaSemana.put("vi", "viernes");
        
        //System.out.println(mapaSemana.get("ju"));        
        mapaSemana.forEach((k,v)->System.out.println(k+": "+v));
        
        // implementacion LinkedHashMap,almacena los elementos en una lista 
        //enlazada por orden de ingreso
        System.out.println("-------");
         System.out.println("LinkedHashMap");
        mapaSemana = new LinkedHashMap();
        // implementacion HashMap, es la mas veloz, no garantiza el orden
        mapaSemana.put("lu", "lunes");
        mapaSemana.put("ma", "martes");
        mapaSemana.put("mi", "miercoles");
        mapaSemana.put("ju", "jueves");
        mapaSemana.put("vi", "viernes");
        mapaSemana.forEach((k,v)->System.out.println(k+": "+v));
         
         
         // implementacion TreeMap,almacena los elementos en un arbol
        System.out.println("-------");
        System.out.println("LinkedHashMap");
         mapaSemana = new TreeMap();
        // implementacion HashMap, es la mas veloz, no garantiza el orden
        mapaSemana.put("lu", "lunes");
        mapaSemana.put("ma", "martes");
        mapaSemana.put("mi", "miercoles");
        mapaSemana.put("ju", "jueves");
        mapaSemana.put("vi", "viernes");
        mapaSemana.forEach((k,v)->System.out.println(k+": "+v));
        
        /* 
        que diferencia hay entre Hashtable y Hashmap        
        
        Hashtable, es menos performante, es Safe Thread, es obsoleta
        Hashmap, es mas performante, NO es Safe Thread, es actual       
        
        */
        
        // interface collections para Safe Thread (multiprocesos)
        //lista Safe Thread
        List<String> listaString = Collections.synchronizedList(new ArrayList());
        listaString.add("hola");
        Set<String> listaSet = Collections.synchronizedSet(new HashSet());
        Map<String, String> mapa = Collections.synchronizedMap(new TreeMap());
        
        
        // Enumerados
        // son un conjunto de constantes y ayudan a validar un campo
        System.out.println("-------------------");
        System.out.println("Clase Enum");
        EstadoCivil estado = EstadoCivil.CASADO;
        Arrays.asList(EstadoCivil.values()).forEach(System.out::println);
        
        // Enumerados avanzados
        System.out.println("Enum avanzado");
        Estado est = Estado.CASADO;
        System.out.println(est.getEstado());      
        Arrays.asList(
                Estado
                    .values())
                    .forEach(item->System.out.println(item.getEstado()));
        
        // VER JSF JPA JSTL JTA
    }
    
}
