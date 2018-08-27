import java.io.*;

  public class Array{
    public static void main(String args[]){
      int min;
      int a[]={1,2,3,4,5};
      min=a[0];
      System.out.println("Max Element in an Array...");
      for(int i=0;i<=a.length;i++)
      {
      int j=i+1;
				if(j<a.length)
				{
				if(a[i]>a[j])
					{
						min=a[j];
					}
				}
			}
			System.out.println(min);
		}
	}
