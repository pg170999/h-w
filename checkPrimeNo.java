import java.util.*;
public class Main {
    public static void main(String args[]) {

  Scanner scn = new Scanner(System.in);
  
  int n=scn.nextInt();
  
  int flag=0;
  
  for(int i=2;i<n;i++)
  {
      if(n%i==0)
      {flag=1;
      break;}
      
  }
  if(flag==0)
    System.out.println("Prime");
  else
    System.out.println("Not Prime");
  
    }
}
