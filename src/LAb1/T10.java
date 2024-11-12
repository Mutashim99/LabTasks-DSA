package LAb1;

public class T10 {
    public static void main(String[] args) {
        String sentence = "I am currently studying Data Structure and Algorithms";

        String[] sentArr = sentence.split(" ");
        String longestWord = "";
        for (int i=0;i<sentArr.length;i++){
            if(sentArr[i].length() > longestWord.length()){
                longestWord = sentArr[i];
            }
        }
        System.out.println("Longest Word is '"+longestWord+"'"+  " with the length of " + longestWord.length());
    }
}