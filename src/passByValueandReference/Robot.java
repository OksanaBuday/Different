package passByValueandReference;

/**
 * Created by Oksana on 26.02.2017.
 */
public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;


    }
    public static void change (Robot ref){
        ref.name = "rok";

    }
    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Robot x,y;
        x = new Robot("ior");
         y = new Robot("Bio");
            processRobot(x);
             change(y);
        System.out.println(x);
        System.out.println(y);
    }

//        processRobot(x);

    public static void processRobot (Robot value) {
//        value = new Robot();
        value.name = "Bob";
    }

}

//public class Robot{
//    int age;
//
//    public Robot(int age) {
//        this.age = age;
//    }
//    public static void change(Robot value){
//        value.age = 1;
//        System.out.println("____" + value.age);
//    }
//    public static void changeObj(Robot value){
//        value = new Robot(4);
//        System.out.println("____" + value);
//    }
//
//    @Override
//    public String toString() {
//        return "Robot{" +
//                "age=" + age +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        Robot x = new Robot(6);
//        Robot y = new Robot(2);
//
//        Robot.change(x);
//        Robot.changeObj(y);
//        System.out.println(x);
//        System.out.println(y);
//
//    }
//}
