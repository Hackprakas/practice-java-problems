package hotel;

import java.util.*;

class admin{

int id=0;
String name="prakash";

ArrayList<hotel> details=new ArrayList<>();
Scanner scanner=new Scanner(System.in);

public void addhotel(int id,String name,float ratings,int roomcount,int roomtype){
    hotel s=new hotel(id,name,ratings,roomcount,roomtype);
    details.add(s);
}

// public void deletehotel(int id){
//     for(hotel s:details){
//         if(s.getid()==id){
//             details.remove(s);
//         }
//     }
// }
public void deletehotel(int id){
    for(int i=0;i<details.size();i++){
        if(details.get(i).getid()==id){
            details.remove(i);
            break;
        }
    }
}

public void updatehotel(int id,int choice){
    for(hotel s:details){
        if(s.getid()==id){
            if(choice==1){
                System.out.print("Enter the hotel Name:");
                s.setName(scanner.next());
            }
            if (choice==2){
                System.out.println("Enter the ratings:");
                s.setRatings(scanner.nextFloat());
            }
            if (choice==3){
                System.out.println("Enter the room count:");
                int y=scanner.nextInt();
                s.updateroomcount(y);
                
            }
        }
    }
}
public void getroomcount(){
    for(hotel s:details){
        s.seehotelroomcount();
    }
}
}





