package hotel;
import java.util.*;
public class hotel {
    private int id;
    private String Name;
    private float ratings;
    private int roomcount;

    HashMap<Integer,Integer> d=new HashMap<>();

    public hotel(int ids,String Names,float ratingss,int count,int roomtype){
        this.id=ids;
        this.Name=Names;
        this.ratings=ratingss;
        this.roomcount=count;
        this.d.put(roomtype,count);
    }

    public int getid(){
        return id;
    }

    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public void setRatings(float ratings){
        this.ratings=ratings;
    }
    public void updateroomcount(int roomcount){
        
        this.roomcount=roomcount;
    }
    public void seehotelroomcount(){
        
            System.out.println("hotel"+id+ "has"+roomcount+"rooms");
        
    }


}
