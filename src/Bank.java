
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seba
 */
class Bank {

    private Hashtable rates = new Hashtable();
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }

    int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
    
    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }
    

}
