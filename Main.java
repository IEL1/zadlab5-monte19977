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
public class Main {
    	    private static void zadanie3(){
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Podaj rozmiar stosu: ");
	        int rozmiarStosu = in.nextInt();
	        zad3 Stak = new zad3(rozmiarStosu);
	        Stak.menu();
	    }
	    private static void zadanie5() {
	        firma company1 = new firma();
	        company1.menu();
	    }
	

	    private static void zadanie6() {
	        zad6 zadanie6 = new zad6();
	        zadanie6.menu();
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int menu = 1;
	        
	        while(menu != 0){
	            System.out.println("1. Zadanie 3");
	            System.out.println("2. Zadanie 5");
	            System.out.println("3. Zadanie 6");
	            System.out.println("0. Wyjscie");
	            menu = in.nextInt();
	            
	            switch(menu){
	                case 1: zadanie3(); break;
	                case 2: zadanie5(); break;
	                case 3: zadanie6(); break;
	                case 0: break;                
	            }
	        }    
	    }
	}


