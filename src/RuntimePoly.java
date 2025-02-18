// Runtime polymorphISM : when the method overriden in the subclass and called through  parent class reference type.
//At Compile time compiler knows only the method in the parent class (reference type)
// But at runtime the JVM dynamically determines which method to call based on  the actual object (object to parent) type 
// So this is why when upcasting done from  child object to parent reference then method in child class will be executed

public class RuntimePoly{

	void display(){

		System.out.println("Compiler knows only parent type (reference type)");

	}
}

class Runtime extends RuntimePoly{
		
		@Override
		void display(){

			System.out.println("This method() (child method/ object method) will be exectuted");
		}

}

class RuntimeTest{

		public static void main(String... abc){

			RuntimePoly	rp = new Runtime(); // upcating; 

			rp.display();
		}

}