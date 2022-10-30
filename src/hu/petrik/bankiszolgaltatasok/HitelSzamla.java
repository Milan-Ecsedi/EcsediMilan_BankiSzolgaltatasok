package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla{

    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret=hitelKeret;

    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    public boolean kivesz(int osszeg){

        if (hitelKeret-osszeg < hitelKeret)
        {


            return false;
        }
        else {

            hitelKeret -=osszeg;
            return  true;
        }
    }





}
