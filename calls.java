import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class calls implements Callable<Integer> {
    calls(){
        System.out.println("call");
    }
    
    @Override
    public Integer call(){
        return 2;
    }

    public static void main(String[] args) {
        calls s=new calls();
        Future<Integer> fut=new Future<Integer>();
        t1.start();


    }
}
