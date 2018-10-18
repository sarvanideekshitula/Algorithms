import java.util.*;
import java.io.*;
public class Topological{
  public static void main(String[] args) {
    DFS d = new DFS();
    for(int j=d.v-1;j<=0;j++){
      System.out.print(d.result[j]);
    }
    System.out.println();
  }
}
