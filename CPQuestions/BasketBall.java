package CPQuestions;
import java.util.*;
public class BasketBall {
    public static int calPoints(String[] operations) {
        int ans = 0 ;
        ArrayList<Integer> list=new ArrayList<>() ;

        for(int i=0;i<operations.length;i++) {
            if (operations[i]=="+") {
                list.add(list.get(list.size()-1)+list.get(list.size()-2)) ;
            }else if (operations[i]=="D") {
                list.add(2*list.get(list.size()-1)) ;
            }else if (operations[i]=="C") {
                list.remove(list.size()-1);
            }else {
                list.add(Integer.valueOf(operations[i])) ;
            }
        }
        for(int i=0;i<list.size();i++) {
            ans+=list.get(i);
        }
        return ans ;
    }
    public static void main(String[] args) {
        // String[] name={"5","2","C","D","+"} ;
        String name[]={"5","-2","4","C","D","9","+","+"};
        int ans =calPoints(name);
        System.out.println(ans);
    }
}
