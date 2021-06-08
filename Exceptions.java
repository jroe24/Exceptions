import java.util.ArrayList;

public class Exceptions{
    public static void main(String[] args){
    ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("24");
        myList.add("Kobe Bryant");
        myList.add(6);
        myList.add("Lakers");

        try{
            for(int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
        }
    }
        catch (Exception e) {
        System.out.println("Something went wrong.");
        }
    }
}