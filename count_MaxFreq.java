// 3541. Find Most Frequent Vowel and Consonant


public class count_MaxFreq {
    

    public static int maxFreqSum(String s) {
        int count1[] = new int[256];
        int count2[] = new int[256];
       

        // Count frequ
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count1[ch]++;
            } else {
                count2[ch]++;
            }
        } 
        int maxVowel = 0;  
        int maxConsonant = 0;

        
        for (int i1 = 0; i1 < s.length(); i1++) {
            char ch = s.charAt(i1);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxVowel = Math.max(count1[ch], maxVowel);
            } else {
                maxConsonant = Math.max(count2[ch], maxConsonant);
            }
        }

                 return maxVowel + maxConsonant;
    }
    public static void main(String[] args) {
        System.out.println(maxFreqSum("hellomydearfriend"));
    }
}