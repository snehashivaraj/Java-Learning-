// sum up all the ages in array and find the average
// in a perfect logical structure 

public  class ArraySum{

	public static int sum(int[] ages){

		int sum = 0;

		for(int num : ages){

			sum += num;

		}


		return sum;
	}

	public static double avgOf(int sum_age, int len ){

		double avgofAge = sum_age/len;

		return avgofAge;
	}
}

class ArraySumMain{

	public static void main(String... jfhjf){

		int age_num[] = {18,79,44,33,89,32,84,2,66};

		int sum_result = ArraySum.sum(age_num);

		System.out.println("Sum of the given ages is :" +sum_result);


		double avg_result= ArraySum.avgOf(sum_result,age_num.length);

		System.out.println("Average of the given ages : " +avg_result);

	}
}