package ar.com.kevinrios.javaadv.clase01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class HiloRepro {
    
    public static void main(String[] args)throws Exception{
        new Player(new BufferedInputStream(new FileInputStream("c:condor.mp3"))).play();
    }
}
