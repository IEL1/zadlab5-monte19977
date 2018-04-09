/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie;

/**
 *
 * 
 */
public class pracownik {
    	     private String imie;
	    private String nazwisko;
	    private int wiek;
	    private String stanowisko;
	    private boolean exist;
	    
	    public pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
	        this.imie = imie;
	        this.nazwisko = nazwisko;
	        this.wiek = wiek;
	        this.stanowisko = stanowisko;
	        this.exist = false;
	    }
	

	    public String getImie() {
	        return imie;
	    }
	

	    public String getNazwisko() {
	        return nazwisko;
	    }
	

	    public int getWiek() {
	        return wiek;
	    }
	

	    public String getStanowisko() {
	        return stanowisko;
	    }
            
            public void setWiek(int wiek) {
	        this.wiek = wiek;
	    }
	

	    public void setStanowisko(String stanowisko) {
	        this.stanowisko = stanowisko;
	    }
	

	    public void setExist(boolean exist) {
	        this.exist = exist;
	    }
	

	    public boolean isExist() {
	        return exist;
	    }
	

	    public void setImie(String imie) {
	        this.imie = imie;
	    }
	

	    public void setNazwisko(String nazwisko) {
	        this.nazwisko = nazwisko;
	    }
	}


