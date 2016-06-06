/**
 * Created by akrzos on 2016-06-06.
 */
public  class AddingSortedTables {

    static int[] dodajTablice(int[] tab1, int[] tab2) {
        int[] tablicaWynik = new int[tab1.length+tab2.length];
            int couterTab1 = 0;
            int couterTab2 = 0;
            int marker = 0;

            while (marker<tablicaWynik.length) {
                if (tab1[couterTab1]<tab2[couterTab2]) {
                    tablicaWynik[marker]=tab1[couterTab1];
                    couterTab1++;
                    marker++;
                } else {
                    tablicaWynik[marker] = tab2[couterTab2];
                    couterTab2++;
                    marker++;
                }
            }
        return tablicaWynik;
    }

    public static void main(String[] args) {
        int[] tablica1 = {1,11,111,112,113,114,1111,11111,1111112};
        int[] tablica2 = {21,211,2111,2112,2113,2114,21111,211111,21111112};

        System.out.println(AddingSortedTables.dodajTablice(tablica1, tablica2));
    }



}
