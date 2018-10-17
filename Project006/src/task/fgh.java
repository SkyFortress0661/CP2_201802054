package task;

import java.text.DecimalFormat;
import java.text.ParseException;

import javax.swing.text.NumberFormatter;

public class fgh {

	public static void main(String[] args) {
		String s = "0.";
		int digits = 8;
		int num =8;
        for (int i = 0; i < digits; i++) {
            s += "0";
        }
        DecimalFormat df = new DecimalFormat(s);

        NumberFormatter nf = new NumberFormatter(df);

        String out = "Illegal Format";
        try {
            out = nf.valueToString(num);
        } catch (ParseException e) {
        	System.out.println("a");
        }
        

	}

}
