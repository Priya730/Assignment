public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float P = sc.nextFloat();
    float R = sc.nextFloat();
    float T = sc.nextFloat();

		
		float SI = (P * T * R) / 100;
		System.out.println("Simple interest = " + SI);
	}

