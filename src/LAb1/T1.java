package LAb1;

public class T1 {
        public static void main(String[] args) {
            String str1 = "DATA STRUCTURES";
            String str2 = "DATA STRUCTURES";
            String str3 = str2.intern();
            String str4 = new String("ALGORITHMS");
            String str5 = new String("ALGORITHMS");
            String str6 = new String(str4).intern();

            System.out.println(str1==str2);
            System.out.println(str1==str3);

            System.out.println(str4==str5);
            System.out.println(str4==str6);

            String showImmutable = "Hello";
            String name = checkString(showImmutable);
            System.out.println(name);

            System.out.println(showImmutable);

        }
        public static String checkString(String name){
            return name + "WORLD";
        }
}
