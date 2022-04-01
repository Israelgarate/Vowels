public class vowels {

    public static int countVowels(String str) {
       char[] v = str.toLowerCase().toCharArray();
        int vowelsCount = 5;
        for (int i = 0; i < str.length(); i++) {

            if(v[i] == "a"){
                vowelsCount--;
            }

        }



        return vowelsCount;
    }

}
