package ro.usv;

public class Main {
    //CPLM
    static class Element<T>
    {
        private T info;
        private Element<T> urm;

        public Element<T> getUrm()
        {
            return urm;
        }

        public void setUrm(Element<T> urm)
        {
            this.urm=urm;
        }

        public Element(T info, Element<T> urm)
        {
            this.info=info;
            this.urm=urm;
        }

        public T getInfo()
        {
            return info;
        }
    }

    public static void main(String[] args) {
	// write your code here

    }
}
