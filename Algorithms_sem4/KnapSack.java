import java.util.*;
import java.io.*;
public class KnapSack{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, c;
    n= sc.nextInt();
    c=sc.nextInt();
    int[] w = new int[n+1];
    int[] v = new int[n+1];
    int[][] B = new int[n+1][c+1];
    w[0]=0;
    for(int i=1;i<=n;i++){
      w[i] = sc.nextInt();
    }
    v[0]=0;
    for(int i=1;i<=n;i++){
      v[i] = sc.nextInt();
    }
    for(int i=0;i<=c;i++){
      B[0][i] = 0;
    }
    for(int i=0;i<=n;i++){
      B[i][0]=0;
    }
    for(int i=1;i<=n;i++){
      for(int j=1;j<=c;j++){
        if(w[i] < j || w[i] == j){
          if(v[i]+B[i-1][j-w[i]] > B[i-1][j]){
            B[i][j] = v[i] + B[i-1][j-w[i]];
          }
          else{
            B[i][j] = B[i-1][j];
          }
        }
        else{
          B[i][j] = B[i-1][j];
        }
      }
    }
    for(int i=0;i<=n;i++){
      for(int j=0;j<=c;j++){
        System.out.print(B[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(B[n][c]);
  }
}
