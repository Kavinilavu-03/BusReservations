package busResv;

public class Bus {
   private int busNo;
   private boolean Ac;
   private int capacity;
    Bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.Ac=ac;
        this.capacity=cap;
    }
    public int getBusNo(){
        return busNo;
    }
    public boolean getAc(){
        return Ac;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setAc(boolean val){
        Ac=val;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }
    public void dispalyBusInfo(){
        System.out.println("BusNo:"+busNo+"  AC:"+Ac+"  Capacity:"+capacity);
    }
}
