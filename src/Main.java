public class Main {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "ggggggg";
        str[1] = "ttttt";
        str[2] = "ggggggg";
        str[3] = "aaaaa";
        str[4] = "ggggggg";

        String str1 = "ggggggg";
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            str1 = str[i];
            index = i;
            for (int y = 0; y < str.length; y++) {
                if (str[y] != null) {
                    if (index != y && str[y].equals(str1)) {
                        str[y] = null;
                    }
                }
            }
        }

        for (int y = 0; y < str.length; y++) {
            if (str[y] != null) {
                str1 = str[y];
                index = y;
                break;
            }
        }

        for (int y = index+1; y < str.length; y++) {
            if (str[y] != null) {
                str1 += str[y];
            }
        }

        System.out.println(str1);


    }
}