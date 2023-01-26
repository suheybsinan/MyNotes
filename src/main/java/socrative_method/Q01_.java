package socrative_method;

public class Q01_ {

    public static void main(String[] args) {

        String arr[][] = {{"Eser"}, {"Kenan", "Oya", "Gulsen"}, {"Yeliz", "Selim"}};

        String arr2[][] = {{"Eser", "Sina", "Ali"}, {"Kenan", "Oya", "Gulsen"}, {"Yeliz", "Selim", "Zeynep"}};

        System.out.println(m(arr));
        System.out.println(m(arr2));

    }

    public static String m(String[][] arr) {

        int r, c;

        String i, k = "";

        for (r = 0; r < arr.length; r++) {

            for (c = 0; c < arr[0].length; c++) {

                i = arr[r][c];

                if (i.length() > k.length())

                    k = i;
            }
        }
        return k;
    }

}
