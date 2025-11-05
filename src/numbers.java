public class numbers {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int row : num[0]) {
            System.out.println(row);
        }
        for (int row2 : num[1]) {
            System.out.println(row2);
        }
        System.out.println(num[1][3]);
        System.out.println(num[0][2]);
        System.out.println(num.length);
        for (int[] row : num) {
            for (int i : row) {
                System.out.println(i);
            }


        }
    }
}

