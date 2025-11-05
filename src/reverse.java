public class reverse {
    public static void main(String[] args){
        String str="navaneetha";
        //StringBuilder is a class ,new StringBuilder(str) is used to keep the string changable,"reverse" is builtin function in StringBuilder which is used to reverse the string,"toString"-is converts to original string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("original value is " +str);
        System.out.println("reverse value is " +reversed);
    }
}
