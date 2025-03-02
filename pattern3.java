import java.util.Scanner;
public class pattern3 {
  public static void eleventhPattern(int n){
    /* eg:n=4
             *
            ***
           *****
          *******
          *******
           *****
            ***
             *
     */
    System.out.println("Pattern-11");
    for(int i=0;i<2*n;i++){
      int temp=i;
      if(temp>=n){
        temp=2*n-i-1;
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
  public static void twelfthPattern(int n){
    /*      eg:n=4
            1
            01
            101
            0101
     */
    System.out.println("Pattern-12");
    for(int i=0;i<n;i++){
      for(int j=0;j<i+1;j++){
        if(i==j || (i-j)%2==0){
          System.out.print("1");
        }  
        else{
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
  public static void thirteenthPattern(int n){
    /*  eg:n=4
          1      1
          12    21
          123  321
          12344321   
     */
    System.out.println("Pattern-13");
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(j+1);
      }
      for(int k=0;k<2*(n-i-1);k++){
        System.out.print(" ");
      }
      for(int l=i;l>=0;l--){
        System.out.print(l+1);
      }
      System.out.println();
    }
    
  }
  public static void fourteenthPattern(int n){
    /*       eg:n=4
                1
                23
                456
                78910
     */
    System.out.println("Pattern-14");
    int num=1;
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(num);
        num++;
      }
      System.out.println();
    }
  }
  public static void fifteenthPattern(int n){
    /*           A
                 AB
                 ABC
                 ABCD
     */
    System.out.println("Pattern-15");
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print((char)('A'+j));
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows:");
    int n=sc.nextInt();
    sc.close();
    eleventhPattern(n);
    twelfthPattern(n);
    thirteenthPattern(n);
    fourteenthPattern(n);
    fifteenthPattern(n);
  }
}
