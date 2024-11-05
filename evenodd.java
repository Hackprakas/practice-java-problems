import java.util.*;
public class evenodd implements Runnable {
    static int count=0;
    @Override
    public  void run(){
     while(count<10){
        synchronized(this){

            if(count%2==0 && Thread.currentThread().getName()=="even"){
                System.out.println("count from even thread"+count);
                count++;
                try{
                    wait();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(count%2!=0 && Thread.currentThread().getName()=="odd"){
                System.out.println("count from odd thread"+count);
                count++;
                
                notify();
                
            }
        }
        
     }
    }
    public static void main(String[] args) {
        evenodd s=new evenodd();
        Thread t1=new Thread(s,"even");
        Thread t2=new Thread(s,"odd");
        t1.start();
        t2.start();

    }
    
}
