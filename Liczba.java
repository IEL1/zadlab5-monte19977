/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie;
import java.util.Scanner;
/**
 *
 * 
 */
public class Liczba {
    	    private final Integer[] liczba;
	

	    public Liczba(String valueString) {
	        liczba = new Integer[valueString.length()];
	        Character[] znaki = new Character[valueString.length()];
	        
	        for (int i=0; i<znaki.length; i++){
	            znaki[i] = valueString.charAt(i);
	        }
	        
	        for (int i=0; i<znaki.length; i++){
	            liczba[i] = Character.getNumericValue(znaki[i]);
	        }
	    }    
	    public void pokaz(){
	        for (int i=0; i<liczba.length; i++){
	            System.out.print(liczba[i]);
	        }
	        System.out.println();
	    }    
	    public void multi(){
	        Scanner in = new Scanner(System.in);
	        String valueString = "";
	        System.out.print(" Podaj wartość: ");
	        int skladnik = in.nextInt();
	        
	        for (int i=0; i<liczba.length; i++){
	            valueString = valueString + Integer.toString(liczba[i]);
	        }        
	        int valueInt = Integer.valueOf(valueString);
	        int result = valueInt * skladnik;
	        
	        valueString = Integer.toString(result);
	        
	        Character[] znaki = new Character[valueString.length()];
	        
	        for (int i=0; i<znaki.length; i++){
	            znaki[i] = valueString.charAt(i);
	        }
	        
	        Integer[] resultTable = new Integer[znaki.length];
	        
	        for (int i=0; i<znaki.length; i++){
	            resultTable[i] = Character.getNumericValue(znaki[i]);
	        }
	        
	        System.out.print("Wynik mnożenia: ");
	        for (Integer resultTable1 : resultTable) {
	            System.out.print(resultTable1);
	        }
	        System.out.println();
	    }
	

	}


