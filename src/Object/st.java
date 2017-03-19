package Object;

/**
 * Created by Oksana on 03.03.2017.
 */
public class st {
    int a = 100;
    int b = 40;
    String r = "Jon";

    @Override
    public String toString() {
        return "st{" +
                "a=" + a +
                ", b=" + b +
                ", r='" + r + '\'' +
                '}';
    }

    public static void main(String[] args) {
        st x = new st();
        System.out.println(x);
    }
}
