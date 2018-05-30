package config;

import java.time.LocalDateTime;
import javafx.scene.control.TextField;
import javafx.util.converter.LocalDateTimeStringConverter;

public class HiloHora implements Runnable{
    /*
    esta interface permite que corra en un hilo aparte
    */
    private TextField txt;
    
    public HiloHora(TextField txt){
        this.txt = txt;
    }
        
    @Override
    public void run(){
        while(true){
            LocalDateTime ldt = LocalDateTime.now();
            txt.setText(
                    ldt.getDayOfMonth()
                        +"/"+ldt.getMonthValue()
                        +"/"+ldt.getYear()
                        +"/"+ldt.getHour()
                        +":"+ldt.getMinute()
                        +":"+ldt.getSecond()
            
            );
                               
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        }
        
    }

    
}
