// method overloading is nothing but Compile time Polymorphism 

public class MethodOverloading{

	//method declared with 2 parameter
	int add(int x, int y){



		return x+y;
	}
	//method overloading with 3 parameters(different number of parameters)
	int add(int a, int b ,int c){

		return a+b+c;
	}
	//method overloading with different type and same number of parameter
	double add(double x, double y){

		return x+y;

	}

}

class Method extends MethodOverloading{

	//method overloading with same number of parameter, same type but different name of parameter

	int add(int x,int y, int z){

		return x+y+z;

	}
}

class MainMethodOverloading{

	public static void main(String[] args){

		MethodOverloading mo = new MethodOverloading();
		int mthod_res1 = mo.add(6,7);
		System.out.println(mthod_res1);

		int mthod_res2 = mo.add(55,965,77); 
		System.out.println(mthod_res2);


		double mthod_res3 = mo.add(10.5,9);
		System.out.println(mthod_res3);

		Method me = new Method();
		int cl_method = me.add(778,8565,584);
		System.out.println(cl_method);
	}
}