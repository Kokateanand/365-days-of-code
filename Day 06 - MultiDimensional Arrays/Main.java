import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        sc.close();
        
        int[] colSum = new int[m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                colSum[j] += arr[i][j];
            }
        }
        for(int i = 0; i < m; i++){
            System.out.print(colSum[i] + " ");
        
        }
    }
}
