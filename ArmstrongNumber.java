public class ArmstrongNumber
{
    public static void main (String S[])
    {
        int n,cube=0,num,newnum;
        n = Integer.parseInt(S[0]);
        newnum=n;
        while(n>0)
        {
            num=n%10;
            cube  = cube+(num*num*num);
            n=n/10;
        }
        if(cube==newnum)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not a Armstrong number");
        }
    }
}
        