package introduction;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");

		double firstNumber = 5;
		double secondNumber = 2;
		int result = (int) (firstNumber / secondNumber);
		System.out.println(result);

		System.out.println(Integer.parseInt("5") + result);
		// System.out.println(Integer.parseInt("a")+result);

		boolean alwaysTrue = true;
		boolean alwaysFalse = false;
		System.out.println(alwaysTrue && alwaysFalse);
		System.out.println(alwaysTrue || alwaysFalse);
		System.out.println(!alwaysTrue);

		// 1. Zadatak
		System.out.println("Prvi zadatak");
		int a = 24;
		int b = 12;
		String operation = "-";
		if (operation == "+")
			System.out.println(a + b);
		else if (operation == "-")
			System.out.println(a - b);
		else if (operation == "/")
			System.out.println(a / b);
		else
			System.out.println(a * b);

		// 2. Zadatak
		int faktorijelBroja = 5;
		int rezultat = 1;
		while (faktorijelBroja >= 1) {
			rezultat = rezultat * faktorijelBroja;
			faktorijelBroja -= 1;
		}
		System.out.println(rezultat);

		// 3. Zadatak
		
		int i;
		
		for(i =0; i < 10; i++)
		{
			if(i % 2 !=0)
			{
				System.out.println(i);
				//break;
				continue;
			}
			System.out.println("dsadsads");
		}
		

		
	}

}
