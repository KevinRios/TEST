package ar.com.KevinRios.java.utils.files;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import javafx.print.Collation;

public interface I_File {
    
    void print();
    String getText();
    void setText(String text);
    void appendText(String text);
    void addLine(String line);
    void addLines(Collection<String> lines);    
    List<String> getLines();
    Set<String> getLinkedHashSetLines();
    Set<String> getTreeSetLines();
    void remove(String line);
    
}
