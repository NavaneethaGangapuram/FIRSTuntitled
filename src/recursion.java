public class recursion {
    static void count(int num) {
        while (num > 0) {
            System.out.print(num + " ");
            num--;
            if (num == 3) {
                count(num); // Recursive call when num hits 3
                break;      // Prevent infinite loop
            }
        }
    }

    public static void main(String[] args) {
        count(5);
    }
}


