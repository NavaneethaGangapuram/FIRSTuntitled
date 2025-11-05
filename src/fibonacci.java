public class fibonacci {
        public static void main(String[] args) {
            int n = 10;
            int a = 0, b = 1;//a is previous term,b is latest term

            System.out.print("Fibonacci Series: " + a + " "+ b);

            for (int i = 2; i < n; i++) {
                int c = a + b;//c is next term
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }

}
//in 1st iteration           in 2nd iteration
//c=a+b=0+1=1                c=a+b=1+1=2
//a=b->a=1                    a=b->a=1
//b=c->b=1                    b=c->a=2.......
