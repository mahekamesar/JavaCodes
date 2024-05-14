package Strings;

public class ReverseString {
    public static void main(String[] args) {
       /* We have 4 methods to reverse a string
        1) By Using Char array
        2) By using charAt() function
        3) By using reverse() of String Builder class
        4) By using reverse() of String Buffer class*/
        String str = "Hello";
        reverseByCharArray(str);
        reverseByCharAt(str);
        reverseByStringBuilder(str);
        reverseByStringBuffer(str);
    }
    public static void reverseByCharArray(String str){
        char[] charArr = str.toCharArray();
        System.out.println("Reverse By Approach 1");
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(charArr[i]+" ");
        }
    }

    public static void reverseByCharAt(String str){
        System.out.println("Reverse By Approach 2");
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

    public static void reverseByStringBuilder(String str){
        System.out.println("Reverse By Approach 3");
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }

    public static void reverseByStringBuffer(String str){
        System.out.println("Reverse By Approach 4");
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
