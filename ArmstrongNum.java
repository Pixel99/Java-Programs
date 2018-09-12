import java.util.*;
public class ArmstrongNum
{
    public static void main (String s[])
    {
        int n,cube=0,num,newnum;
        Scanner SC = new Scanner (System.in);
        System.out.println("Please enter a number");
        n = SC.nextInt();
        newnum=n;
        while(n>0)
        {
            num=n%10;
            cube = cube+(num*num*num);
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
        