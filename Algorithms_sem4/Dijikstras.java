import java.util.*;
import java.io.*;
public class Dijikstras{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v, e;
    v = sc.nextInt();
    e = sc.nextInt();
    int[][] array = new int[v][v];
    int[] dest = new int[v];
    int[] visited = new int[v];
    for(int i=0;i<e;i++){
      int n, m, w;
      n = sc.nextInt();
      m = sc.nextInt();
      w = sc.nextInt();
      array[n][m] = w;
    }
    for(int i=0;i<v;i++){
      for(int j=0;j<v;j++){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    dest[0]=0;
    for(int i=1;i<v;i++){
      dest[i] = 1000;
    }
    int min=0;
    for(int i=0;i<v;i++){
      for(int j=0;j<v;j++){
        if (array[min][j] > 0){
          if(dest[j] > (array[min][j]+dest[min])){
              dest[j] = array[min][j]+dest[min];
          }
          else{
            ;
          }
        }
      }
      visited[min] = 1;
      int p=10000;
      for(int k=0;k<v;k++){
        if(visited[k] == 0){
          if(dest[k] < p)
          min = k;
        }
      }
    }
    for(int i=0;i<v;i++){
      System.out.print(dest[i] + " ");
    }
    System.out.println();
  }
}
