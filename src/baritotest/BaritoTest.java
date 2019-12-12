/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baritotest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author riven.konguasa
 */
public class BaritoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ask;
        do {
            
            Scanner Input = new Scanner(System.in);
            System.out.println("Select Nomor Soal (2 / 3) : ");
            int getInput = Input.nextInt(); 
            
            
            switch(getInput){
                case 2 : 
                    String[] dictionary =  {"hot", "dot", "dog", "lot", "log"};
                    Scanner Soal2Scan = new Scanner(System.in);  
                    System.out.println("Input String : ");

                    String getSoal2 = Soal2Scan.nextLine(); 
        
                    List<String> result;
                    result = Soal2.wordConverter(dictionary, getSoal2.toLowerCase());
                    System.out.println(result);
                    break;
                    
                case 3 : 
                    Scanner Soal3Scan = new Scanner(System.in);  
                    System.out.println("Input array angka : ");

                    String getSoal3 = Soal3Scan.nextLine(); 
        
                    int result2;
                    result2 = Soal3.stockDealer(getSoal3);
                    System.out.println(result2);
                    break;
                    
                    
        }
            System.out.println("Continue(Y/N)");
            Scanner Ask = new Scanner(System.in);
            ask = Ask.nextLine();
        
        }while(ask.equals("Y") || ask.equals("y"));
        
	//System.out.println(result);
        
        
        // TODO code application logic here
    }
    
}
