public class Exercise3 {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder reversedWord = new StringBuilder();
            int punctuationIndex = word.length();
            if(!Character.isLetter(word.charAt(word.length()-1))){
                punctuationIndex = word.length()-1;
            }
            for(int k = punctuationIndex - 1; k >=0; k--){
                reversedWord.append(word.charAt(k));
            }
            if(punctuationIndex < word.length()){
                reversedWord.append(word.charAt(word.length()-1));
            }
            result.append(reversedWord).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
