package Object;

/**
 * Created by Oksana on 04.03.2017.
 */
public class matr {
    public static void main(String[] args) {
        String arr [][] ;
        arr = new String[][]{
                {"*","2", "3", "4","*"},
                {"6","*", "8", "*","10"},
                {"11", "12","*", "14", "15"},
                {"16","*", "18","*", "20"},
                {"*","22", "23", "24","*"},
        };
        for(int i = 0; i < arr.length; i++ ){
            for (int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
