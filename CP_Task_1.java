import java.util.*;
class CP_Task_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String last="";
        StringTokenizer st=new StringTokenizer(str," ");
        while(st.hasMoreTokens())
        {
            last=st.nextToken();
        }
        System.out.print(last.length());
        sc.close();
    }
}