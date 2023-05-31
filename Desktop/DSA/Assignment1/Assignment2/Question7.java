
import java.io.*;

public class Question7 {


static boolean check(int arr[])
{
	int N = arr.length;
	boolean inc = true;
	boolean dec = true;

	
	for (int i = 0; i < N - 1; i++) {

	if (arr[i] > arr[i + 1]) {
		inc = false;
	}
	}

	
	for (int i = 0; i < N - 1; i++) {

	
	if (arr[i] < arr[i + 1]) {
		dec = false;
	}
	}

	
	return inc || dec;
}

public static void main (String[] args) {
	int arr[] = { 1, 2, 3, 3 };

	
	boolean ans = check(arr);
	if (ans == true)
	System.out.print("True");
	else
	System.out.print("False");
}
}


