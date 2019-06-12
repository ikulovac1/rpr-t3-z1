package ba.unsa.etf.rs.tutorijal11;

public class MedunarodniBroj extends TelefonskiBroj{

    @Override
    public String ispisi() {
        return drzava + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
    String drzava;
    String broj;

    public MedunarodniBroj (String drzava , String broj){
        this.drzava = drzava;
        this.broj = broj;
    }

}