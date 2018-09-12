import java.io.*;
public class AreaRect
{
   int l,b;
    public int calculate(int l,int b)
    {
        int area=0;
        area = l*b;
        
        return (l*b);
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Please enter the length of the rectangle");
        int l=Integer.parseInt(r.readLine());
        System.out.println("Please enter the breadth of the rectangle");
        int b=Integer.parseInt(r.readLine());
        AreaRect rectangle = new AreaRect();
        int area = 0;
        area = rectangle.calculate(l,b);
        System.out.println("The area is " +area);
        
    }
}
        

        