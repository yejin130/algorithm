package boj;

public class test {
	public static void main(String[] args) {
		String input_s = String.valueOf(2);

		String [] arr = new String[2];

		arr = input_s.split("");
		
		if(input_s.length() == 1) {
			arr[1] = arr[0];
			System.out.println(arr[0]+"a"+arr[1]);
			arr[0] = "0";
		}
		
		System.out.println(arr);
	}
}
