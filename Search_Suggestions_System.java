import java.util.*;

class Search_Suggestions_System {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> output = new ArrayList<>();
        Arrays.sort(products); // sort products lexicographically
        
        int leftIndex = 0;
        int rightIndex = products.length - 1;
        
        for (int index = 0; index < searchWord.length(); index++) {
            char charVal = searchWord.charAt(index);
            
            // move leftIndex to first product matching the prefix
            while (leftIndex <= rightIndex) {
                if (products[leftIndex].length() <= index || products[leftIndex].charAt(index) != charVal) {
                    leftIndex++;
                } else {
                    break;
                }
            }
            
            // move rightIndex to last product matching the prefix
            while (rightIndex >= leftIndex) {
                if (products[rightIndex].length() <= index || products[rightIndex].charAt(index) != charVal) {
                    rightIndex--;
                } else {
                    break;
                }
            }
            
            // collect up to 3 products in range [leftIndex, rightIndex]
            List<String> temp = new ArrayList<>();
            for (int i = leftIndex, count = 0; i <= rightIndex && count < 3; i++, count++) {
                temp.add(products[i]);
            }
            
            output.add(temp);
        }
        
        return output;
    }
    public static void main(String[] args) {
        Search_Suggestions_System a = new Search_Suggestions_System();
        String products[] = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        System.out.println(a.suggestedProducts(products, searchWord));
    }
    /*
     * Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
     */
}
