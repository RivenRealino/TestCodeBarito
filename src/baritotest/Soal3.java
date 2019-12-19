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

        int untung  = 0;
        int beli = 0;
        int jual =0;
        int temp = 0;
        
        int hari_beli = 0;
        int hari_jual = 0;
        String[] input = Input.split(" ");
        
        int[] listHarga = new int[input.length];
        int[] untungs = new int[listHarga.length];
        
        for(int i = 0; i < input.length; i++){
            listHarga[i] = Integer.parseInt(input[i]);
        }
        
        for(int i = 0; i <= listHarga.length; i++){
            if(i < listHarga.length - 1){
                hari_beli = i;
                System.out.println("Hari Beli : " + hari_beli);
                hari_jual = i + 1;
                System.out.println("Hari Jual : " + hari_jual);
            
                beli = listHarga[hari_beli];
                System.out.println("Harga Beli : " + beli);
                jual = listHarga[hari_jual];
                 System.out.println("Harga Jual : " + jual);
            
                if(beli < jual){
                    untung = jual - beli;
                    System.out.println("Untung : " + untung);
                    untungs[i] = untung;
                    System.out.println("Untung arrays [" + i + "] : " + untungs[i]);
                }
                
                if(untungs[i] < untungs[i + 1]){
                    untung = untungs[i+1];
                }
                
                
                 System.out.println("================================");
            }
            
            
        }
        
        //System.out.println(untung);
        
        int hasil = untung;
        
        return hasil;
    }
    
}
