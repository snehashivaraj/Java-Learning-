//java.lang.String methods 


public class StringMethods{

	/** Basic Methods
	 * string.length()
	 * string.charAT(index)
	 * string.substring(strarting index, ending )
	 * string.equals(str)
	 * string.equalsIgnoreCase(str)
	 * string.compareTo(str)
	 * */

	public static void stringbasicMethods(String s){

 
		int len = s.length();
		char val = s.charAt(4);
		String sub = s.substring(6,17);
		boolean ans = s.equals("every open-source project uses github to manage projects");
		boolean ans2 = s.equalsIgnoreCase("every open-source Project uses github to manage Projects.");
		int compared = s.compareTo("App"); //returns positive bcz unicode of 'A' is smaller than 'E'

		System.out.println("Length of the given String is : "+len);
		System.out.println("The char at the given index is : " +val);
		System.out.println("The substring spiltted is : "+sub);
		System.out.println("The two string are equal ? : " +ans);
		System.out.println("Ignore case sensitive - are they two equal ? : "+ans2);
		System.out.println(" comparing and returning the value is : "+compared);  //69 - 64 = 4


		return;
	}
	/**
	 * string.contains(str)
	 * string.indexOf(str)
	 * string.lastIndexOf(str)
	 * string.startsWith(str)
	 * string.endsWith(str)
	 * 
	 * */

	public static void 	searchingMethods(String s1){

		boolean contained = s1.contains("programming");
		int index_string = s1.indexOf("apps");
		int inex_last = s1.lastIndexOf("apps");
		boolean start_with = s1.startsWith("Java");
		boolean end_with =s1.endsWith("applications");

		System.out.println("Does it contains string ? : "+contained);
		System.out.println("Index of the searching substring : "+index_string);
		System.out.println("Last index of the substring u are searching :"+inex_last);
		System.out.println("whether it starts with the given i/p ? :"+start_with);
		System.out.println("Endswith ? :" +end_with);

		return;
	}
	/**
	 * string.toUpperCase()
	 * string.toLowerCase()
	 * string.trim()
	 * string.replace("old substring", "new")
	 * string.replaceAll("regex" "replacement")
	 * */

	public static void modificationMethods(String s3){

		String upper_version = s3.toUpperCase();
		String lower_version = s3.toLowerCase();
		String trimmed_version = s3.trim();
		String replacing = s3.replace("I","Everyone");
		String replace_char = s3.replaceAll(",","\n");

		System.out.println("Upper case Version : "+upper_version);
		System.out.println("Lower case version : " +lower_version);
		System.out.println("After trimed : "+trimmed_version);
		System.out.println("Replaced string :" +replacing);
		System.out.println("Replaced char : "+replace_char);

		return;
	}

	public static void splitAndJoin(String s4){

		String[] words_in_string = s4.split(" ");

        // Joining the words with "+"
        String joined = String.join("+", words_in_string);

        // Printing split words
        for (String word : words_in_string) {
            System.out.println(word);
        }

        // Printing the joined string
        System.out.println("The words joined: " + joined);
	}
}

class MainStringMethods{

	public static void main(String[] fjfh){

		System.out.println("Basic String Methods:............");

		StringMethods.stringbasicMethods("Every open-source project uses GitHub to manage projects.");

		System.out.println("Searching Method....................................... ");

		StringMethods.searchingMethods("Java is a programming language used to create a variety of applications, including mobile apps, enterprise apps, scientific apps, web apps, and more");

		System.out.println("Modifying Methods");

		StringMethods.modificationMethods("I want to be a software engineer because it is a profession that combines my interests in technology, problem solving, and working with people.");
		
		System.out.println("Splitting and joining");

		StringMethods.splitAndJoin("Every word is splitted");

		return;


	}
}