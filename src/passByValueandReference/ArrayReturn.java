package passByValueandReference;

/**
 * Created by Oksana on 26.02.2017.
 */
public class ArrayReturn {
    private int [] value;

    public int [] sort (int[] value) {
        this.value = value;
        return value;
    }

     public void echo (){
         System.out.println(this.value [0]);
     }

    public static void main(String[] args) {
        ArrayReturn x = new ArrayReturn();
        final int [] arr = {1};
        final int [] ri = x.sort(arr);
        ri[0]=-2;
        x.echo();
    }
}
