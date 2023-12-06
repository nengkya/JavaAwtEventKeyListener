class Power {

    public static void main(String[] arguments) {

	int number = 5;
	int power  = 3;

	System.out.println(power(5, 3));

    }

    static int power(int a, int b) {

	int power = 1;

	for (int c = 0; c < b; c++) {
	    power *= a;
	}

	return power;

    }

}
