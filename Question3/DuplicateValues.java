package Question3;

public class DuplicateValues {

	public static void main(String[] args) {

		String[] arr = new String[]{"man", "hat", "june", "not", "man", "kit","may","not"};

	    for (int i = 0; i < arr.length; i++) {
	      for (int j = i + 1; j < arr.length; j++) {
	        if (arr[i].equals(arr[j])) {
	          System.out.println("Duplicate values : " + arr[i]);
	        }
	      }
	   }
	}

}
