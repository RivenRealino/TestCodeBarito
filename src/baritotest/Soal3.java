/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baritotest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author riven.konguasa
 */
public class Soal3 {
    
    public static int stockDealer(String Input){

        String[] input = Input.split(" ");
        
        int[] urutan = new int[input.length];
        
        for(int i = 0; i < input.length; i++){
            urutan[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(urutan);
        
        System.out.println(urutan.length);
        
        int hasil = urutan[urutan.length - 1] - urutan[0];
        
        return hasil;
    }
    
}
