/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntnrc
 */
import hardware.Bateria;

public class TestBateria {
    public static void main(String args[]){
        Bateria bateria = new Bateria(100);
        
        System.out.println(bateria);
        bateria.setPorcentaje(99);
        
        System.out.println(bateria);
        
    }
}