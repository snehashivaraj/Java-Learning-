//upcasting changing to class type    : changing the reference type to parent class in an inheritance hierarchy 

public class UpcastingExample{	//using builtin class

	public static void changingtype(){	//toparent

		java.lang.Byte by = 88;
		java.io.Serializable se = by;    //upcasting 
		System.out.println(se);

		java.lang.Number num = by;
		System.out.println(num);

		Object ob = by;
		System.out.println(o);



		//we can change the parent after upcasting 
		// now byte is changed to serializable 	

		

	}

}

class UpcastingExampleMain{

	public static void main(String... fgiodfgj){

		UpcastingExample.changingtype();


	}
}
//uses : Achieving polymorphism, code resusability, avoiding and duplication 