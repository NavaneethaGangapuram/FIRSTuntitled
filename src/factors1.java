public class factors1 {
    public static void main(String[] args) {
        int fact=6;
        int i=1;
        do {
            fact=fact*i;
            i++;
        }
        while(i<=5);
        System.out.println("the factorial of a number is:"+fact);
    }
}
