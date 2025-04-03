package day7.lambda.assignment;

public class StringLibrary {
	public static String toTitleCase(String str) {
		String s[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String x : s)
			sb.append(x.substring(0,1).toUpperCase() +
				x.substring(1).toLowerCase());
		return sb.toString();
	}
	public static String toCamelCase(String str) {
		String s[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i =0;i< s.length;i++) {
			if(i==0) {
				sb.append(s[i].toLowerCase());
			}
			else {
				sb.append(s[i].substring(0,1).toUpperCase()+ s[i].substring(1).toLowerCase());
			}
		}
		return sb.toString();
	}
	
	public static String removeSpaces(String str) {
		
		String res = "";
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				res += str.charAt(i);
			}
		}
		return res;
	}
	
	public static int countVowels(String str) {
		int count=0;
		for(int i =0;i<str.length();i++) {
			if(str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'|| str.toLowerCase().charAt(i) == 'i'|| 
					str.toLowerCase().charAt(i) == 'o'|| str.toLowerCase().charAt(i) == 'u' ) {
				count++;
			}
		}
		return count;
	}
	public static int countConsonants(String str) {
		int count=0;
		for(int i =0;i<str.length();i++) {
			if(!(str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'|| str.toLowerCase().charAt(i) == 'i'|| 
					str.toLowerCase().charAt(i) == 'o'|| str.toLowerCase().charAt(i) == 'u'  || str.charAt(i) == ' ')) {
				count++;
			}
		}
		return count;
	}
	public static int countAlphabets(String str) {
		int count = 0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122 ) {
				count++;
			}
		}
		return count;
	}

	
}
