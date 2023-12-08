import java.math.BigDecimal;

class MovePointRight {

    public static void main(String... arguments) {

	long base = 5;
	int scale = 4;

	/* 0.0005 */
	BigDecimal number = BigDecimal.valueOf(base, scale);
	System.out.println(number);

	BigDecimal movePointRight = number.movePointRight(1);
	System.out.println("movePointRight = " + movePointRight);

    }

}
