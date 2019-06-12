package ba.unsa.etf.rs.tutorijal11;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

//pretraživanje brojeva koristeći klasu ​HashMap
public class Imenik {

    public Imenik(){}

    private HashMap<String , TelefonskiBroj> userPhoneNumber = new HashMap<>();

    public HashMap<String, TelefonskiBroj> getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(HashMap<String, TelefonskiBroj> userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void dodaj (String ime , TelefonskiBroj broj){ userPhoneNumber.putIfAbsent(ime, broj);}

    //poziva se ispisi
    public String dajBroj(String ime){return userPhoneNumber.get(ime).ispisi();}

    // koristiti HashMap
    public String dajIme(TelefonskiBroj broj){
        for (var x: userPhoneNumber.entrySet()){
            if (x.getValue().compareTo(broj)==0) return x.getKey();
        }
        return "";
    }

    // sve brojeve onih cije ime pocinje na slovo s , u formatu: 1. Ime Prezime - broj
    public String naSlovo(char s){
        StringBuilder str = new StringBuilder();
        for (var x : userPhoneNumber.entrySet()){
            int brojac = 1;
            if (x.getKey().charAt(0) == s){
                str.append(String.format("%d. %s - %s\n", brojac , x.getKey() , x.getValue().ispisi() ) );
                brojac++;
            }
        }
        return str.toString();
    }

    // vraća osobe koje žive u gradu ​(istog pobrojanog tipa iz klase FiksniBroj)->ako osoba ima fiksni broj telefona u tom gradu
//  sortiran abecedno
    public Set<String>izGrada(FiksniBroj.Grad g){
        Set<String> ljudiIzHuda = new TreeSet<>();
        for (var x: userPhoneNumber.entrySet()){
            if (x.getValue() instanceof FiksniBroj){
                if (((FiksniBroj) x.getValue()).getGrad().equals(g))
                    ljudiIzHuda.add(x.getKey());
            }
        }
        return ljudiIzHuda;
    }


    //sortiran po stringu koji se dobije motodom ispisi()
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> brojeviIzHuda = new TreeSet<>();
        for (var x: userPhoneNumber.entrySet()){
            if (x.getValue() instanceof FiksniBroj){
                if ((((FiksniBroj) x.getValue()).getGrad().equals(g)))
                    brojeviIzHuda.add(x.getValue());
            }
        }
        return brojeviIzHuda;
    }


}