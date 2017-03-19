package Object;

/**
 * Created by Oksana on 03.03.2017.
 */
public class sqr {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double d;

         d = b*b-4*a*c;
         if (d>0){
             double x1, x2;

             x1 = (-b - Math.sqrt(d)) / (2*a);
             x2 = (-b + Math.sqrt(d)) / (2*a);
             System.out.println("Корені:" +"x1: " + x1 + " x2: " + x2 );
         }
         if (d==0) {
             double x;
             x = -b / (2*a);
             System.out.println("один корінь" + x);
         }
         if (d<0) {
             System.out.println("немає коренів");
         }
    }
}

