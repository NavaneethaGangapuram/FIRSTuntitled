public class uplow {
    public static void main(String[] args){
        String str="navaneetha";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(9));
        System.out.println("position of e :"+str.indexOf("e"));
        String str1=str.toUpperCase();
        String str2="GANGAPURAM";
        String str3=str2.toLowerCase();
        String str4=str1 + str2;
        int result1=str3.length();
        System.out.println("String after converting to upper case:"+str1);
        System.out.println("String after converting to lower case:"+str3);
        System.out.println("String after concatination :"+str4);
        System.out.println("length of string is:"+result1);
        String str6="i am navaneetha";
        System.out.println("the position of 'am':"+str6.indexOf("am"));
    }
}
