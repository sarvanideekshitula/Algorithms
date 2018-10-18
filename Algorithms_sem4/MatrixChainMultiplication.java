import java.util.*;
import java.io.*;
class MatrixChainMultiplication
{
    static int MatrixChainOrder(int p[], int n)
    {
        int m[][] = new int[n][n];
        int i, j, k, L, q;
        for (i = 1; i < n; i++)
            m[i][i] = 0;
        for (L=2; L<n; L++)
        {
            for (i=1; i<n-L+1; i++)
            {
                j = i+L-1;
                if(j == n) continue;
                m[i][j] = 1000000;
                for (k=i; k<=j-1; k++)
                {
                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if (q < m[i][j])
                        m[i][j] = q;
                }
            }
        }
        return m[1][n-1];
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n;
      n = sc.nextInt();
      int[] p = new int[n+1];
      p[0]=sc.nextInt();
      p[1]=sc.nextInt();
      for(int i=2;i<=n;i++){
        int x = sc.nextInt();
        p[i] = sc.nextInt();
      }
        int size = p.length;
        int m[][] = new int[n][n];
        int i, j, k, L, q;
        for (i = 1; i < n; i++)
            m[i][i] = 0;
        for (L=2; L<n; L++)
        {
            for (i=1; i<n-L+1; i++)
            {
                j = i+L-1;
                if(j == n) continue;
                m[i][j] = 1000000;
                for (k=i; k<=j-1; k++)
                {
                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if (q < m[i][j])
                        m[i][j] = q;
                }
            }
        }
        System.out.println(m[1][n-1]);
    }
}
