import java.io.*;
import java.util.*;
public class Substring {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = "Hello World";
		System.out.println("Enter a character or a substring");
		String substr = s.nextLine();
		if(str.contains(substr)){
			System.out.println("Substring found");
		}
		else {
			System.out.println("Substring not found");
		}
	}
}

	