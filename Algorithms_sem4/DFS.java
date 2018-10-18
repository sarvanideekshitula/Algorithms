import java.util.*;
import java.io.*;
public class DFS{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v, e;
    v = sc.nextInt();
    e = sc.nextInt();
    StackInt s = new StackInt(v);
    StackInt s1 = new StackInt(v);
    StackInt s2 = new StackInt(v);
    StackInt s3 = new StackInt(v);
    Vertex[] a = new Vertex[v];
    Vertex[] a1 = new Vertex[v];
    int[][] array = new int[v][v];
    int[][] array1 = new int[v][v];
    int[] result = new int[v];
    for(int i=0;i<v;i++){
      a[i] = new Vertex();
    }
    for(int i=0;i<e;i++){
      int n, m;
      n = sc.nextInt();
      m = sc.nextInt();
      array[n][m] = 1;
      array1[m][n] = 1;
    }
    for(int i=0;i<v;i++){
      for(int j=0;j<v;j++){
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
    //dfs(1, v, array, visited);
    int flag=0, mini=0;
    for(int k=0;k<v;k++){
      if(a[k].color == "white"){
        s.push(k);
        a[k].color = "grey";

        while(s.isEmpty() != 1){
          int q = s.peek();
          int cnt=0;
          for(int i=0;i<v;i++){
            if(array[q][i] == 1 && a[i].color == "white"){
              s.push(i);
              a[i].color = "grey";
              cnt++;
            }
            q = s.peek();
          }
          if(cnt == 0){
            System.out.print(q + " ");
            result[flag] = q;
            flag++;
            s1.push(s.pop());
          }
        }
        mini++;
      }
    }
    System.out.println(mini);
    System.out.println();
    System.out.println("Topological: ");
    for(int j=v-1;j>=0;j--){
      System.out.print(result[j] + " ");
    }
    System.out.println();
    System.out.println("Strongly Connected: ");
    for(int i=0;i<v;i++){
      a1[i] = new Vertex();
    }
    for(int k=0;k<v;k++){
      if(a1[k].color == "white"){
        s2.push(k);
        a1[k].color = "grey";

        while(s2.isEmpty() != 1){
          int q = s2.peek();
          int cnt=0;
          for(int i=0;i<v;i++){
            if(array1[q][i] == 1 && a1[i].color == "white"){
              s2.push(i);
              a1[i].color = "grey";
              cnt++;
            }
            q = s2.peek();
          }
          if(cnt == 0){
            System.out.print(q + " ");
            s3.push(s2.pop());
          }
        }
      }
      System.out.println();
    }
  }
}
