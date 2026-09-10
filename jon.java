
public class jon {

    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3},
            {5, 6, 7},
            {8, 9, 0}
        };
        for (int i = 0; i < mat.length; i++) {
            int l = 0, r = mat.length;
            while (l < r) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
