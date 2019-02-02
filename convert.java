import java.util.*;

public class convert {

	public static void main (String[] args) {

		int digit_ctr = 2;
		int exp = 1;
		int index = 0;
		int total_decimal = 0;
		int base = 8;
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(1);

		do {
			total_decimal += input.get(index) * Math.pow(base, exp);
			digit_ctr--;
			index++;
			exp--;
    }while(digit_ctr > 0);

		System.out.println(total_decimal);
	}
}
