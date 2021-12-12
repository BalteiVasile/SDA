package ro.usv;

public abstract class Angajat extends Persoana
{
    int id;

    public Angajat(String nume,String prenume,int id)
    {
        super(nume,prenume);
        this.id=id;
    }

    public int getId()
    {
        return this.id;
    }

    //wtf?
}
