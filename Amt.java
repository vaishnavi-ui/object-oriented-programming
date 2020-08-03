package Objects;


import java.io.*;
public class Amt
{
    int rs,ps;
    void input() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the rupees");
        System.out.println("Enter the paise");
        rs=Integer.parseInt(in.readLine());
        ps=Integer.parseInt(in.readLine());
    }
    void display()
    {
        System.out.println("Rupees->"+rs);
        System.out.println("Paise->"+ps);
    }
    void main() throws IOException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        Amt ob1=new Amt();
        Amt ob2=new Amt();
        Amt ob3=new Amt();
        ob1.input();
        ob2.input();
        ob3.sum(ob1,ob2);
        
    }
    void sum(Amt a1,Amt a2)
    {
        Amt s=new Amt();
        s.rs=a1.rs+a2.rs;
        s.ps=a1.ps+a2.ps;
        s.display();
    }
}
    
    