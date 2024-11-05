package hotel;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        admin s=new admin();
        Scanner scanner=new Scanner(System.in);
        while(true){

        
        System.out.println("Choose from the following details");
        System.out.println("1.Add hotel");
        System.out.println("2.Update hotel");
        System.out.println("3.Delete Hotels");
        System.out.println("4.see room count");

        int d= scanner.nextInt();
        switch(d){
            case 1:
                System.out.println("Enter the hotel id:");
                int id=scanner.nextInt();
                System.out.println("Enter the hotel name:");
                String name=scanner.next();
                System.out.println("Enter the ratings:");
                float ratings=scanner.nextFloat();
                System.out.println("Enter the roomcount:");
                int roomcount=scanner.nextInt();
                System.out.println("Enter the roomtype:");
                int roomtype=scanner.nextInt();
                s.addhotel(id, name, ratings,roomcount,roomtype);
                System.out.println("added successfully");
                break;
            case 2:
                System.out.println("Enter the hotel id:");
                int id1=scanner.nextInt();
                System.out.println("Choose from the following details");
                System.out.println("1.Update hotel name");
                System.out.println("2.Update hotel ratings");
                System.out.println("3.Update room count");
                int choice=scanner.nextInt();
                s.updatehotel(id1, choice);
                break;
            case 3:
                System.out.println("Enter the hotel id:");
                int id2=scanner.nextInt();
                s.deletehotel(id2);
                break;
            case 4:
            s.getroomcount();
            break;
            case 5:
            System.exit(0);

        }
        
    }
    }
}
