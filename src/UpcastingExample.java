//upcasting changing to class type    : changing the reference type to parent class in an inheritance hierarchy 

public class UpcastingExample{	//using builtin class

	public static void changingtype(){	//toparent

		java.lang.Byte by = 88;
		java.io.Serializable se = by;    //upcasting 
		System.out.println("Byte to Serializable "+se);

		java.lang.Number num = by;
		System.out.println("Byte to number "+num);

		Object ob = by;
		System.out.println("Byte to Object " +ob);


		

	}

}
//Downcasting is converting the parent class reference back to the orgiginal child class reference 

class DownCasting{

	public static void downcasting(){

		Short s = 66;
		java.lang.Number num = s;

		System.out.println("Number "+num);

		System.out.println("Downcasting....");

		Short s1 = (Short)num;

		System.out.println("Short "+s1);	
	}
}


class UpcastingExampleMain{

	public static void main(String... fgiodfgj){

		UpcastingExample.changingtype();
		DownCasting.downcasting();


	}
}
//uses : Achieving polymorphism, code resusability, avoiding and duplication 