package lab_traits;

import java.util.ArrayList;
import java.util.List;

public class QuoterAggregator {

    private static List<Quoter> quotes = new ArrayList<>();

    public static void addQuoter(Quoter quoter){
        quotes.add(quoter);
    }

    public static void printAllMessages(){
        quotes.forEach(Quoter::printMessage);
    }

}
