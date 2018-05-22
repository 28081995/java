package pgms.functional;

import com.Utility;

/**
 * @author 28081995
 *
 */
public class Distance {
public static void main(String[] args) {
		
		double xCoOrdinate = Double.parseDouble(args[0]); //x coordinate
		double yCoOrdinate = Double.parseDouble(args[1]); //y coordinate
		
        Utility utility = new Utility();
        double distance = utility.measureDistance(xCoOrdinate, yCoOrdinate);
        //calculating distance between (x,y) and origin(0,0)
		
	}



}


