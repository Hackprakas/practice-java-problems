package hotel;
import java.util.*;

public class hour {
    public static void main(String[] args) {
        int arr[]={53,57,52,3,7,8,60,60,60};
        HashMap<Integer,Integer> s=new HashMap<>();
        int n=60;
        int count=0;
        for(int i=0;i<arr.length;i++){
           if(s.containsKey(n-arr[i]) && s.get(n-arr[i]) == 1){
            s.put(n-arr[i],0);
            count=count+1;
           }
           else{
            if(arr[i]==60){
                s.put(60,s.getOrDefault(60, 0)+1);
            }
           
           else{
            s.put(arr[i],s.getOrDefault(arr[i], 0)+1);
           }
        }
        
        }
        if(s.containsKey(60)){
            count=count+s.get(60)/2;
            System.out.println("here");
        }
        
        
        System.out.println(count);
    }
}
