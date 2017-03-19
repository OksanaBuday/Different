package Object;

/**
 * Created by Oksana on 03.03.2017.
 */
public class eq {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void D (int a, int b){
        System.out.println("fef" );

    }
    public void V (int a, int b) {
        System.out.println("lec");
    }

    public static void main(String[] args) {
       eq a = new eq();
        a.D(2,4);
        eq b = new eq();
        b.V(2,4);
        System.out.println(a.equals(b));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    }


