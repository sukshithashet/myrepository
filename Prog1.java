import java.io.*;
import java.lang.*;
class T1 extends Thread
{
    public void run()
    {
        for(;;)
        {
            int n;
            try
            {
                Thread.sleep(1000);
                n=(int)(Math.ceil)(Math.random()*10));
                System.out.println("genearted number is"+n);
                if(n%2==0)
                {
                    T2 obj1=new T2();
                    obj1.start();
    
                }
            }
        }
    }
}
{
    
}
