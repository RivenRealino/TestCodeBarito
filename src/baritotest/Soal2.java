/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baritotest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author riven.konguasa
 */
public class Soal2 {
    
    public static List<String> wordConverter(String[] Dictionary, String Input){
        
        char[] alphabetList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String Temp = null;
        String tester = null;
        int count = 0;
        String[] input = Input.split(" ");
                
        char[] firstWord = new char[input[0].length()]; 
        for (int i = 0; i < input[0].length(); i++) { 
            firstWord[i] = input[0].charAt(i); 
            //System.out.println(firstWord[i]);
        } 
        
        List<String> dictionaryList = new ArrayList<>();
	for(String s : Dictionary){
		dictionaryList.add(s);
	}
        
        List<String> Result = new ArrayList<>();
        Result.add(input[0]);

        for(int ch =0; ch < firstWord.length; ch++){
            tester = Temp;
            //System.out.println("> " + tester);
            if(count == 0){
                //System.out.println("Masuk sini");
                for(int alp = 0; alp < alphabetList.length; alp++){
                    Temp = input[0].replace(firstWord[ch], alphabetList[alp]);
                    //System.out.println(Temp);
                    boolean resultMaster = dictionaryList.stream().anyMatch(Temp::equals);
                    if(Temp.equals(input[1])){
                        Result.add(Temp);
                    } else if(resultMaster) {
                        //System.out.println(Temp + alp);
                        Result.add(Temp);
                        count = count + 1;
                        break;
                    }
                }
            } else if(count == 1){
                //System.out.println("Masuk sana");
                 for(int alp = 0; alp < alphabetList.length; alp++){
                    Temp = tester.replace(firstWord[ch], alphabetList[alp]);
                    //System.out.println(Temp);
                    boolean resultMaster = dictionaryList.stream().anyMatch(Temp::equals);
                    if(resultMaster) {
                        //System.out.println(Temp + alp);
                        if(Temp.equals(input[1])){
                            Result.add(Temp);
                        }
                        break;
                    }
                    
                    
                }
                 
                 if(ch == input[0].length() && tester != input[1]){
                     ch = 0;
                     count = 0;
                 }
            }    
        }
					
        System.out.println(Result);
        
        return Result;
    }

    
}
