package Hashing.set;

import java.util.HashMap;

public class IntenableJourney {
    // Fnction for finding the start point 
    public static String getStart(HashMap<String,String> ticket) {
        HashMap<String,String> revTicket=new HashMap<>();

        for(String str:ticket.keySet()) {
            revTicket.put(ticket.get(str), str) ;
        }

        for(String str:ticket.keySet()) {
            if (!revTicket.containsKey(str)) {
                return str ;
            }
        }
        return null ;
    }
    public static void main(String[] args) {
        HashMap<String,String> ticket=new HashMap<>() ;
        ticket.put("Chennai", "Bengaluru") ;
        ticket.put("Mumbai", "Delhi") ;
        ticket.put("Goa", "Chennai") ;
        ticket.put("Delhi","Goa") ;

        String start = getStart(ticket);
        System.out.print(start);
        for(String str:ticket.keySet()) {
            System.out.print("->"+ticket.get(start)) ;
            start=ticket.get(start) ; 
        }

    }
}
