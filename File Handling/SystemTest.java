import java.io.*;
class SystemTest
{
public static void main(String S[]) throws Exception
{
FileInputStream fout = new FileInputStream("SystemTest.java");
PrintStream ps = new PrintStream("file1.txt");
PrintStream ps1 = new PrintStream("file2.txt");
System.out.println("Default stream about to change");
System.setIn(fout);
System.setOut(ps);
System.setErr(ps1);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
while(true)
{
String str = br.readLine();
if(str==null)
break;

if(str.length()>10)
System.out.println(str);
else
System.err.println(str);
}
}
}