import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;

/**
 * Created by akrzos on 2016-06-06.
 */
public class Reversing {
    public static void main(String[] args) {
        int[] tablica = {1,2,3};
        int[] tablicaReverse = new int[7];
        for (int i = 0; i < tablica.length; i++) {
            tablicaReverse[i] = tablica[tablica.length-i-1];
            System.out.println(tablicaReverse[i]);
        }

    }
}
