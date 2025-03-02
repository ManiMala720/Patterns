import java.util.Scanner;
public class pattern2 {
  public static void sixthPattern(int n){
  /*  eg:n=4
         *
        ***
       *****
      ******* 
   */
  System.out.println("Pattern-6");
  for(int i=0;i<n;i++){
    for(int j=0;j<n-i+1;j++){
      System.out.print(" ");
    }  
    for(int k=0;k<2*i+1;k++){
      System.out.print("*");
    }
    System.out.println();
  }
  }
  public static void seventhPattern(int n){
    /*    eg:n=4
          *******
           *****
            ***
             *
     */
    System.out.println("Pattern-7");
    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      for(int k=0;k<2*(n-i)-1;k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void eigthPattern(int n){
    /*  eg:n=4
         *
        ***
       *****
      ******* 
       *****
        ***
         *
   */
  System.out.println("Pattern-8");
  for(int i=0;i<2*n-1;i++){
    int temp=i;
    if(temp>=n){
      temp=2*n-i-2;
    }
    for(int j=0;j<n-temp-1;j++){
      System.out.print(" ");
    }
    for(int k=0;k<2*temp+1;k++){
      System.out.print("*");
    }
    System.out.println();
  }
  }
  public static void ninthPattern(int n){
    /*   eg:n=4
          *
          **
          ***
          ****
          ***
          **
          * 
     */
    System.out.println("Pattern-9");
    for(int i=0;i<2*n-1;i++){
      int star=i;
      if(star>=n){
        star=2*(n-1)-i;
      }
      for(int j=0;j<=star;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void tenthPattern(int n){
    /*    1234
          123
          12
          1
    */
    System.out.println("Pattern-10");
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i;j++){
        System.out.print(j+1);
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows:");
    int n=sc.nextInt();
    sc.close();
    sixthPattern(n);
    seventhPattern(n);
    eigthPattern(n);
    ninthPattern(n);
    tenthPattern(n);
  }
}
