package datastructures.src.com.scaler.array.general;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s = sc.nextLine();
			int B = sc.nextInt();
			sc.nextLine();
			String str[] = s.split(" ");
			boolean flag = false;
			for(int i=0;i<str.length;i++) {
				if(Integer.parseInt(str[i])==B) {
					flag = true;
					break;
				}
			}
			System.out.println(flag?1:0);
		}

	}

}
