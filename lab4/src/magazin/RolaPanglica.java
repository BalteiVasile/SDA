package magazin;

public class RolaPanglica {
    private double disp=1000;
    private static RolaPanglica inst=null;
    private RolaPanglica() {};

    static RolaPanglica getInstance()
    {
        if(inst==null)
        {
            inst=new RolaPanglica();
        }
        return inst;
    }

}
