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
public class zad3 {
        private int stos[];
    private int wskaźnik;


    public zad3(int rozstos) {
        stos = new int[rozstos];
        wskaźnik = -1;
    }
    private boolean x() {
        Scanner in = new Scanner(System.in);
        if(wskaźnik >= 0){
            stos[wskaźnik] = 0;
            wskaźnik--;
            System.out.println("Działa");
            return true;
        } 
        else{
            System.out.println("Stos jest juz pusty ");
            in.nextLine();
            return false;
        }
    
    }
    private boolean push(){
        Scanner in = new Scanner(System.in);


        if(wskaźnik < stos.length-1){
            wskaźnik++;            
            System.out.print("Podaj wartość która zostanie dodana do stosu: ");
            int wskaźnikNowaWartosc = in.nextInt();
            stos[wskaźnik] = wskaźnikNowaWartosc;
            System.out.println("Gotowe");
            return true;
        }
        else {
            System.out.println("Stos jest pełny, nie mozna dodać wiecej");
            in.nextLine();
            return false;
        }
    }
    private boolean zawartoscStosu(){
        Scanner in = new Scanner(System.in);
        if (wskaźnik != -1){
            System.out.println("\n_____");
            for (int i=0;i<=stos.length-1;i++){
                System.out.println(stos[i]);
            }
            System.out.println("____\n");
            return true;
        }
        else {
            System.out.println("Stos jest pusty");
            in.nextLine();
            return false;
        }
    }
    public void menu(){
        Scanner in = new Scanner(System.in);
        int menu = 1;
        
        while(menu != 0){
            System.out.println("1. Wkładanie \n2. Wyciąganie \n3. Zawartość stosu\n0. Koniec programu");
            menu = in.nextInt();
            
            switch(menu){
                case 1: if(push()) System.out.println("Działa!");
                else System.out.print("Error!");
                break;
                case 2: if(x()) System.out.println("Działa!");
                else System.out.print("Error!");
                    break;
                case 3:
                    if(zawartoscStosu()) System.out.println("Działa!");
                else System.out.print("Error!");
                    break;
                case 0: break;
            }
        }
    }



}
