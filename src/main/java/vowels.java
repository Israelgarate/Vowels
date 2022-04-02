public class vowels {

    public static int countVowels(String str) {
       char[] v = str.toLowerCase().toCharArray();
       char[] vowels = {'a','e','i','o','u'};
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {

            if(v[i] == 'a' || v[i] == 'e' || v[i] == 'i' || v[i] == 'o' || v[i] == 'u' ){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
