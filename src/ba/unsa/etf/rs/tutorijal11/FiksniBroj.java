
package ba.unsa.etf.rs.tutorijal11;

public class FiksniBroj extends TelefonskiBroj {


    public FiksniBroj(Grad grad, String broj){
        this.grad = grad;
        fiksni = broj;
    }

    enum Grad{SARAJEVO, TUZLA, ZENICA , TRAVNIK, ORASJE,
        LIVNO, MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG,
        MRKONJICGRAD, BANJALUKA, PRIJEDOR, DOBOJ, SAMAC,
        BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE}

    private Grad grad;
    private String fiksni;

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getFiksni() {
        return fiksni;
    }

    public void setFiksni(String fiksni) {
        this.fiksni = fiksni;
    }

   // @Override
    public String ispisi() {
        String tok="";
        if (grad == Grad.TRAVNIK) tok+="030/";
        if (grad == Grad.ORASJE) tok+="031/";
        if (grad == Grad.ZENICA) tok+="032/";
        if (grad == Grad.SARAJEVO) tok+="033/";
        if (grad == Grad.LIVNO) tok+="034/";
        if (grad == Grad.TUZLA) tok+="035/";
        if (grad == Grad.MOSTAR) tok+="036/";
        if (grad == Grad.BIHAC) tok+="037/";
        if (grad == Grad.GORAZDE) tok+="038/";
        if (grad == Grad.SIROKIBRIJEG) tok+="039/";
        if (grad == Grad.MRKONJICGRAD) tok+="050/";
        if (grad == Grad.BANJALUKA) tok+="051/";
        if (grad == Grad.PRIJEDOR) tok+="052/";
        if (grad == Grad.DOBOJ) tok+="053/";
        if (grad == Grad.SAMAC) tok+="054/";
        if (grad == Grad.BIJELJINA)  tok+="055/";
        if (grad == Grad.ZVORNIK)  tok+="056/";
        if (grad == Grad.PALE)    tok+="057/";
        if (grad == Grad.FOCA)           tok+="058/";
        if (grad == Grad.TREBINJE)
            tok+="059/";
        tok+=fiksni;
        return tok;
    }

    @Override
    public int hashCode() {
        return 0;
    }






}