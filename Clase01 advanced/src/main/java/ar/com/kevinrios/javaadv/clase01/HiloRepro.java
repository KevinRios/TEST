package ar.com.kevinrios.javaadv.clase01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class HiloRepro implements Runnable{
    
    public static void main(String[] args)throws Exception{
        new Player(new BufferedInputStream(new FileInputStream("resources/musica.mp3"))).play();
    }

    @Override
    public void run() {
        try {
            new Player(new BufferedInputStream(new FileInputStream("resources/musica.mp3"))).play();    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
