
public class Lab3 {
	
	public static void main(String[] arg)
	{
		float fahrenheit, centigrade;
		
		fahrenheit =(float) 98.6; // to cast to float you can also do 98.6f
		
		centigrade = (5/9f)*(fahrenheit-32); //(5/9) logical error, 0.something it will take 0. thus add float

		System.out.println("Fahreinheit is: "+fahrenheit+", centigreade is: "+centigrade);
		
		System.out.println();
		
		System.out.println("For Loop result");
		
		for(fahrenheit=0; fahrenheit<=40; fahrenheit+=5)
		{
			centigrade = (5/9f)*(fahrenheit-32); //(5/9) logical error, 0.something it will take 0. thus add float

			System.out.println("Fahreinheit is: "+fahrenheit+", centigreade is: "+centigrade);
		}
		
		fahrenheit=0;
		
		System.out.println();
		
		System.out.println("While loop result");
		while(fahrenheit<=40)
		{
			centigrade = (5/9f)*(fahrenheit-32); //(5/9) logical error, 0.something it will take 0. thus add float

			System.out.println("Fahreinheit is: "+fahrenheit+", centigreade is: "+centigrade);
			
			fahrenheit+=5;
		}
		
	}

}
