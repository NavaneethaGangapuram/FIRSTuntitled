public class multipleobject1 {
    void prime()
    {
        for (int j = 1; j <= 14; j++) {
            boolean b = true;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(j + " is a prime number");
            } else {
                System.out.println(j + " is not a prime number");
            }
        }
    }
}
