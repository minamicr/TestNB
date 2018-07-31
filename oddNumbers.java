import java.util.Scanner;

public class oddNumbers {

	

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int left = scanner.nextInt();
		int right = scanner.nextInt();
		scanner.close();

		int[] oddNumbers = oddNumbersPrint(left, right);

		printNumbers(oddNumbers);

	}
	
	private static void printNumbers(int[] arr){
		for (int i = 0; i < arr.length; i++){
			System.out.println("numero: " + arr[i]);
		}
	}
	
	private static int[] oddNumbersPrint(int left, int right){
		String oddNumbers = "";
		
		for (int i = left; i <= right; i++){
			if (i%2 != 0){
				arraySize ++;
				oddNumbers = oddNumbers + ' ' + i;
			}
		}
		
		System.out.println("numbers : " + oddNumbers);
		String[] oddArrayString = oddNumbers.trim().split(" ");
		int[] oddArrayNumber = new int[oddArrayString.length];
		
		for (int i = 0; i < oddArrayString.length; i++){
			oddArrayNumber[i] = Integer.parseInt(oddArrayString[i]);
		}
		
		return oddArrayNumber;
	}
	
	

}
