package ba.unsa.etf.rs.tutorijal11;

public class MobilniBroj extends TelefonskiBroj {

    @Override
    public String ispisi() {
        return "0" + mobilnaMreza.toString() + "/" + mobilni;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    Integer mobilnaMreza;
    String mobilni;

    public MobilniBroj(int mobilnaMreza , String broj) {
        this.mobilnaMreza=mobilnaMreza;
        mobilni = broj;
    }
}