import java.math.BigDecimal;

class BigDecimalExample {

    public static void main(String[] arguments) {

	BigDecimal bigDecimal1 = new BigDecimal(25.25);
	BigDecimal bigDecimal2 = new BigDecimal(50.50);

	bigDecimal1 = bigDecimal1.add(bigDecimal2);
	System.out.println("bigDecimal1 add = " + bigDecimal1);

	bigDecimal1 = bigDecimal1.negate();
	System.out.println("bigDecimal1 negate() = " + bigDecimal1);

    }

}
