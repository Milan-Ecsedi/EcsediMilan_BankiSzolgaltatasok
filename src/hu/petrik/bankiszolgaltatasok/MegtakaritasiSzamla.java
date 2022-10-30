package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;

    public double alapKamat =1.1;


    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);

    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg){

        if (aktualisEgyenleg-osszeg<0)
        {
            return false;
        }
        else {
           aktualisEgyenleg-=osszeg;
            return true;
        }


    }

    public void kamatJovairas(){

    aktualisEgyenleg *= kamat;

    }






}
