package ar.com.KevinRios.java.utils.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileText implements I_File {

    private File file;

    public FileText(File file) {
        this.file = file;
    }

    public FileText(String file) {
        this.file = new File(file);
    }

    /*
      abro el stream
      FileReader in = new FileReader(file);
      // leo
        while((car=in.read())!=-1){
           System.out.println((char)car);
        }
      //cierro
      in.close();
     */
    @Override
    public void print() {
        // a partir de java 7 existe try with resource
        int car;
        try (FileReader in = new FileReader(file)) {
            while ((car = in.read()) != -1) {
                System.out.print((char) car);
            }

        } catch (FileNotFoundException e) {
            System.out.println("no se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Problemas al leer el archivo");
        } catch (Exception e) {
            System.out.println("ocurrio un error no esperado");
            System.out.println(e);
        }
    }

    @Override
    public String getText() {
        int car;
        StringBuilder sb = new StringBuilder();

        try (FileReader in = new FileReader(file)) {
            while ((car = in.read()) != -1) {
                sb.append((char) car);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sb.toString();
    }

    @Override
    public void setText(String text) {

        try (FileWriter out = new FileWriter(file)) {
            out.write(text);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
   
    @Override
    public void appendText(String text) {
        try (FileWriter out = new FileWriter(file, true)) {
            out.write(text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void setLines(Collection<String> lines) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            for (String st : lines) {
                out.write(st);
                out.newLine();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void addLine(String line) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
            out.write(line);
            out.newLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void addLines(Collection<String> lines) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
            for (String st : lines) {
                out.write(st);
                out.newLine();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public List<String> getLines() {
        // devuelve una lista con el contenido completo del archivo
       List<String> lista = new ArrayList();
        try(BufferedReader in = new BufferedReader(new FileReader(file))){
            //in.lines().forEach(item->lista::add);
            in.lines().forEach(lista::add);
        } catch (Exception e) {
            System.out.println(e);
        }        
        return lista;
    }

    @Override
    public Set<String> getLinkedHashSetLines() {
        Set<String> set = new LinkedHashSet();
        set.addAll(getLines());
        return set;
    }

    @Override
    public Set<String> getTreeSetLines() {
        // devuelve un set sin duplicados y ordenado alfabeticamente
        Set<String> set = new TreeSet();
        set.addAll(getLines());
        return set;
    }

    @Override
    public void remove(String line) {
        List<String> lineas = getLines();
        lineas.remove(line);
        setLines(lineas);
              
    }

    
}
