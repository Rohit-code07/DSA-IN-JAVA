public class butterfly {
    public static void main(String[] args) {
        int n=4;
//Upper half part  
      for(int i=1;i<=n;i++)
      {
    // 1.left part

        for(int j=1;j<=i;j++) 
        {System.out.print("*");}

    //print spaces btw the star

        for(int k=1;k<=2*(n-i);k++)
       {System.out.print(" ");}

    // 2.right part

      for(int j=1;j<=i;j++)
      {System.out.print("*");}
      System.out.println();

      }

//lower half part  
      for(int i=n;i>=1;i--)
      {
        // 1.left part
    
            for(int j=1;j<=i;j++) 
            {System.out.print("*");}
    
        //print spaces btw the star
    
            for(int k=1;k<=2*(n-i);k++)
           {System.out.print(" ");}
    
        // 2.right part
    
          for(int j=1;j<=i;j++)
          {System.out.print("*");}
          System.out.println();
    
          } 

    }
}

