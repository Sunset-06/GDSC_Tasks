import java.util.*;
public class CP_Task_2
{
     static void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    static void quad(int[] arr,int tar)
    {
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++) 
            {
                for (int k=j+1;k<arr.length;k++) 
                {
                    for (int l=k+1;l<arr.length;l++) 
                    {
                        int sum =arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum==tar)
                        {
                            int[] temp={arr[i],arr[j],arr[k],arr[l]};
                            display(temp);
                        }
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] inp=new int[n];
        for(int i=0;i<n;i++)
            inp[i]=sc.nextInt();
        int t=sc.nextInt();
        Arrays.sort(inp);
        System.out.println("Quads:");
        quad(inp,t);
        sc.close();
    }
}
