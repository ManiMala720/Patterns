import java.util.Scanner;
public class pattern4 {
  public static void sixteenthPattern(int n){
    /* eg:n=4
              ABCD
              ABC
              AB
              A
     */
    System.out.println("Pattern-16");
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i;j++){
        System.out.print((char)('A'+j));
      }
      System.out.println();
    }
  }
  public static void seventeenthPattern(int n){
    /* eg:n=4
              A
              BB
              CCC
              DDDD
     */
    System.out.println("Pattern-17");
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print((char)('A'+i));
      }
      System.out.println();
    }
  }
  public static void eighteenthPattern(int n){
    /* eg:n=4
                A
               ABA
              ABCBA
             ABCDCBA   
     */
    System.out.println("Pattern-18");
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i;j++){
        System.out.print(" ");
      }
      for(int k=0;k<=i;k++){
        System.out.print((char)('A'+k));
      }
      for(int l=i;l>0;l--){
        System.out.print((char)('A'+l-1));
      }
      System.out.println();
    }
  }
  public static void nineteenthPattern(int n){
    /* eg:n=4
            D
            CD
            BCD
            ABCD
     */
    System.out.println("Pattern-19");
    for(int i=0;i<n;i++){
      for(int j=n-i;j<=n;j++){
        System.out.print((char)('A'+j-1));
      }
      System.out.println();
    }
  }
  public static void twentiethPattern(int n){
    /* eg:n=4
            ****
            *  *
            *  *
            ****
     */
    System.out.println("Pattern-20");
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
        if(i==0 || i==n-1 || j==0 || j==n-1){
          System.out.print("*");
        }
        else{
          System.out.print(" "); 
        }
       }
       System.out.println();
      }
      
    }
    
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows:");
    int n=sc.nextInt();
    sc.close();
    sixteenthPattern(n);
    seventeenthPattern(n);
    eighteenthPattern(n);
    nineteenthPattern(n);
    twentiethPattern(n);
  }
}
