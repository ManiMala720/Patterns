import java.util.Scanner;
public class pattern1 {
  public static void firstPattern(int n){
    /*     eg:n=4 
            ****
            ****
            ****
            ****
    */
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void secondPattern(int n){
    /*        eg:n=4 
               *
               **
               ***
               ****   
     */
    for(int i=0;i<n;i++){
      for(int j=0;j<i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void thirdPattern(int n){
    /*         eg:n=4 
                1
                12
                123
                1234
     */
    for(int i=0;i<n;i++){
      for(int j=0;j<i+1;j++){
        System.out.print(j+1);
      }
      System.out.println();
    }
  }

  public static void fourthPattern(int n){
    /*           eg:n=4
                  1
                  22
                  333
                  4444
     */
    for(int i=0;i<n;i++){
      for(int j=0;j<i+1;j++){
        System.out.print(i+1);
      }
      System.out.println();
    }
  }
  public static void fifthPattern(int n){
    /*           eg:n=4
                  ****
                  ***
                  **
                  *
     */
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:");
     int n=sc.nextInt();
     sc.close();
     firstPattern(n);
     secondPattern(n);
     thirdPattern(n);
     fourthPattern(n);
     fifthPattern(n);
  }
}
