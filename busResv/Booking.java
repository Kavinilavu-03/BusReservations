package busResv;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;
    Booking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        passengerName=sc.next();
        System.out.println("Enter the BusNo:");
        busNo=sc.nextInt();
        System.out.println("Enter the date dd-mm-yyy");
        String dateInput=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusNo()==busNo){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for(Booking b:bookings){
            if(b.busNo==busNo && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
    }


