package day28exceptions;

public class InterviewQuestion03 {
    public static void main(String[] args) {
        /*
        Create a method like;
        "aabbbbaaad" ==> a2b4a3d1
         */
        String str = "aabbbbaaaddd";
        System.out.println(getCharAndNum(str));
    }

    public static String getCharAndNum(String str) {
        int count = 1;
        String result = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.substring(i - 1, i).equals(str.substring(i, i + 1))) {
                count++;

            } else {
                result = result + str.substring(i - 1, i) + count;
            }
        }
        return result;
    }
}
