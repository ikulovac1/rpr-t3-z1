package ba.unsa.etf.rs.tutorijal11;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj> {

    public abstract String ispisi();

    @Override
    public abstract int hashCode();

    @Override
    public int compareTo(TelefonskiBroj tel){
        return this.ispisi().compareTo(tel.ispisi());
    }
}