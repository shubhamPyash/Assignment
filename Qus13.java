package Assignment;

public class Qus13
{
	public static void main(String[] args)
    {
        int a[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
        int s=0;
        int e=0;
      
        for (int i = 0; i < a.length-1; i++)
        {
            if(i==0)
            {
                s=a[0];
                for(int j=i;j<a.length-1;j++)
                {
                    if(a[j+1]-1!=a[j])
                    {
                        e=a[j];
                        break;
                    }
                }
                System.out.println(s+" "+e);
            }
            else if(a[i+1]-a[i]>=2)
            {
                s=a[i+1];
                for(int j=i+1;j<a.length-1;j++)
                {
                    if(a[j+1]-1!=a[j])
                    {
                        e=a[j];
                        break;
                    }
                    if(j==(a.length-2))
                    {
                        e=a[a.length-1];
                    }
                }
                System.out.println(s+" "+e);
            }
        }
}

}
