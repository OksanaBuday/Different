package Object;

import java.util.Arrays;

/**
 * Created by Oksana on 16.03.2017.
 */
public class example {
    public static void main(String[] args) {
        int arr[] = {1, 1, 5, 3, 8, 3, 7, 32, 32};

        Arrays.sort(arr);
    }
        private static int[] removeDuplicates ( int[] values)
        {
            int[] arr;
            int[] tmp = new int[values.length];
            int i = 0,
                    ind = 1,
                    k = 0;
            boolean isDuplicate = false;

            while (i < values.length) {
                isDuplicate = false;
                for (int j = i + 1; j < values.length; j++) {
                    if (values[i] == values[j]) {
                        ind = j;
                        tmp[k] = values[j];
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate)
                    tmp[k] = values[i];
                else {
                    i = ind;
                    isDuplicate = false;
                }
                i++;
                k++;
            }

            arr = new int[k];

            for (int l = 0; l < k; l++)
                arr[l] = tmp[l];

            return arr;
//            System.out.println(arr[i]);
        }
    }
