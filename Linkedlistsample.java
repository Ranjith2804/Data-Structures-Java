 import java.util.*;
  class link{
      int d;
      link next;
      
      public link(int val)
      {
          d=val;
          next=null;
      }
  }
  class linkedlist{
      link h;
      public linkedlist()
      {
          this.h=null;
      }
      
      public void append(int v)
      {
          link newnode =new link(v);
          if(h==null)
          {
              h=newnode;
              return;
          }
          link last=h;
          while(last.next!=null)
          {
              last=last.next;
          }
          last.next=newnode;
      }
     public void disp()
     {
         link c= h;
         while(c.next!=null)
         {
             System.out.print(c.d+"->");
             c=c.next;
         }
         System.out.print(c.d+".");
     }
  }
  public class Main{
      public static void main(String args[] )
      {
          linkedlist l=new linkedlist();
          int n;
          Scanner s=new Scanner(System.in);
          System.out.print("Enter the number of linkedlist: ");
          n=s.nextInt();
          System.out.println("Enter the elements of linkedlist: ");
          for(int i=0;i<n;i++)
          {
              l.append(s.nextInt());
          }
          System.out.println("The Elements of linkedlist: ");
          l.disp();
          
      }
  }
