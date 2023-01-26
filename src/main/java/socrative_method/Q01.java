package socrative_method;

public class Q01 {

    public static void main(String[] args) {

        String[][] arr = {{"Eser"}, {"Kenan", "Oya", "Gulsen"}, {"Yeliz", "Selim"}};

        System.out.println(m(arr));
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












    /*
        String str = "Java";
        System.out.println(str);

        String[] strArr = str.split("");
        System.out.println(Arrays.toString(strArr));

        int deger = 175;

        int idx = 0;
        for (String w: Integer.toString(deger).split("")) {

            System.out.println(Integer.toString(deger).charAt(idx));
            idx++;
        }

         */

}
