import java.util.*;
import java.io.*;
public class MatrixChain{
  static int matrix(int[] p, int n){
    int[][] m = new int[n][n];
    for(int i=1;i<n;i++){
      m[i][i] = 0;
    }
    int cost, j;
    for(int len=2;len<n;len++){
      for(int i=1;i<n-len+1;i++){
        j = i+len-1;
        if(j==n)
        continue;
        m[i][j] = 100000;
        for(int k=i;k<=j-1;k++){
          cost = m[i][k]+m[k+1][j]+(p[i-1]*p[k]*p[j]);
          if (cost < m[i][j]){
            m[i][j] = cost;
          }
        }
      }
    }
    return m[1][n-1];
  }
  public static void main(String[] args) {
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
    System.out.println(matrix(p, size));
  }
}
