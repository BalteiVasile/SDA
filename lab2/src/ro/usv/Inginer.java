package ro.usv;
public class Inginer extends Angajat {
    private static final int nrMaxOreLucrate = 250;
    private double coeficientSlarial = 1.5;
    public Inginer(String nume, String prenume, int id)
    {
        super(nume, prenume, id);
    }
    @Override
    public int getNrMaxOreLucrate() {
        return nrMaxOreLucrate;
    }
    public double getCoeficientSlarial() {
        return coeficientSlarial;
    }
}
