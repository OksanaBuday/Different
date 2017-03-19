package Object;

/**
 * Created by Oksana on 09.03.2017.
 */
public class clone {
    String name;
    int age;

    public clone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "clone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

     public static class Robot {
        String name;

         public Robot(String name) {
             this.name = name;
         }

         @Override
         public String toString() {
             return "Robot{" +
                     "name='" + name + '\'' +
                     '}';
         }
     }

    public static void main(String[] args) throws CloneNotSupportedException {
        Robot robot = new Robot("Ivan");
        clone clone = new clone("Jon", 34);



        clone Clone = (clone) clone.clone();
            System.out.println(robot);
            System.out.println(clone);
        clone.name = new String("Kate");
        clone.name = "maik";
            System.out.println(robot);
            System.out.println(clone);

    }
}
