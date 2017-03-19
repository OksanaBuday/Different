package Object;

/**
 * Created by Oksana on 05.03.2017.
 */
public class hash {
    private int age;

//    public hash(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "hash{" +
//                "age=" + age +
//                '}';
//    }
            @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        hash x = new hash();
        x.age = 3;
        System.out.println("age " + x);

    }
}
