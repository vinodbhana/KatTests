package KatTest.KatTests;

/**
 * Kat Test methods
 * @Author Vinod Bhana
 * 
 * 
 */
public class Test1 {
	/**
	 * Prints each number from 1 to 100 on a new line. For each multiple of 3, print
	 * "Foo" instead of the number. For each multiple of 5, print "Bar" instead of
	 * the number. For numbers that are multiples of both 3 and 5, print "FooBar"
	 * instead of the number.
	 */
	public void printNumber() {
		for (int cnt = 1; cnt <= 100; cnt++) {
			if (cnt % 3 == 0 && cnt % 5 == 0) {
				System.out.println("FooBar");
			} else if (cnt % 3 == 0) {
				System.out.println("Foo");
			} else if (cnt % 5 == 0) {
				System.out.println("Bar");
			} else {
				System.out.println(cnt);
			}
		}
	}

	/**
	 * Sort an integer array of your own choosing and return the top n elements. For
	 * example, given array {2, 12, 1, 9, 6} requesting the top 3 elements the
	 * result would be {12,9,6}.
	 * @param arr - Input Array.
	 * @param num - Number of array elements to return
	 * @return - Array.
	 * @exception - If array is null.
	 */
	public int[] sortArray(int arr[], int num) throws Exception {
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			if (num > arr.length)
				num = arr.length;
			int rtnArr[] = new int[num];
			System.arraycopy(arr, 0, rtnArr, 0, num);
			return rtnArr;
		}else {
			throw new Exception ("Null array");
		}
		
	}
	
/**
 * Test whether two input strings are anagrams. 
 * Two strings are anagrams of each other if they contain the same characters using each of the characters 
 * exactly once. 
 * Example anagrams: ANGEL and GLEAN; ABBA and BABA. Example non-anagrams: MUMMY and YUMMY; ANT and TANGENT.
 * @param s1 - String 1
 * @param s2 - String 2
 * @return - true if both string value are anagrams else false.
 */
	public boolean isAnagrams(String s1, String s2) {
		boolean rtnVal = true;
		if (s1 != null && s2 != null && s1.length() == s2.length()) {
			int len = s1.length();
			for (int i = 0; i < len; i++) {
				if (s1.charAt(i) != s2.charAt(len - i - 1)) {
					rtnVal = false;
					break;
				}
			}
		} else {
			rtnVal = false;
		}
		return rtnVal;
	}

	/*
	public static void main1(String s[]) throws Exception {
		Test1 t1 = new Test1();
		// t1.printNumber();
		int arr[] = { 2, 12, 1, 9, 6 };
		int rtnArr[] = t1.sortArray(arr, 3);
		for (int i = 0; i < rtnArr.length; i++) {
			System.out.println(rtnArr[i]);
		}
	}

	public static void main(String s[]) {
		Test1 t1 = new Test1();
		String s1 = "1TST";
		String s2 = "TST1";
		boolean rtn = t1.isAnagrams(s1, s2);
		System.out.println(rtn);

	}
*/
}
