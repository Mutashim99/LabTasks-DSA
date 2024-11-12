package LAb1;

public class T4 {
    public static void main(String[] args) {
        String Str1 = "abcdef";
        String Str2 = "ghijkl";
        String newStr = "";
        int maxLength;
        if(Str1.length() > Str2.length()){
            maxLength = Str1.length();
        }else{
            maxLength = Str2.length();
        }

        for(int i=0;i<maxLength;i++){
            if(i< Str1.length()){
                newStr += Str1.charAt(i);
            }
            if(i < Str2.length()){
                newStr += Str2.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}