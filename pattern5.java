import java.util.Scanner;
public class pattern5 {
  public static void twentyfirstPattern(int n){
    /* eg:n=4
          ********
          ***  ***
          **    **
          *      *
          *      *
          **    **
          ***  ***
          ********
     */
    System.out.println("Pattern-21");
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i;j++){
        System.out.print("*");
      }
      for(int k=0;k<2*i;k++){
        System.out.print(" ");
      }
      for(int l=0;l<n-i;l++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      for(int k=0;k<2*(n-i-1);k++){
        System.out.print(" ");
      }
      for(int l=0;l<=i;l++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void twentysecondPattern(int n){
    /*  eg:n=4
                *      *
                **    **
                ***  ***
                ********
                ***  ***
                **    **
                *      *
  
    */
    System.out.println("Pattern-22");
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      for(int k=0;k<2*(n-i-1);k++){
        System.out.print(" ");
      }
      for(int l=0;l<=i;l++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        System.out.print("*");
      }
      for(int k=0;k<2*i+2;k++){
        System.out.print(" ");
      }
      for(int l=0;l<n-i-1;l++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void twentythirdPattern(int n){
    /* eg:n=4
                 4444444
                 4333334
                 4322234
                 4321234
                 4322234
                 4333334
                 4444444

     */
    System.out.println("Pattern-23");
    for(int i=0;i<2*n-1;i++){
      for(int j=0;j<2*n-1;j++){
        int top=i;
        int left=j;
        int bottom=2*n-2-i;
        int right=2*n-2-j;
        int min=Math.min(Math.min(top,bottom),Math.min(left,right));
        System.out.print(n-min);
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows:");
    int n=sc.nextInt();
    sc.close();
    twentyfirstPattern(n);
    twentysecondPattern(n);
    twentythirdPattern(n);
    
  }
}
