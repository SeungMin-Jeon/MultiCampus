package baekjun;

import java.util.Scanner;


public class Main {
	
	
	public int[] solution(int n, int[] arr1) {
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			answer[i] = arr1[i];
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
		
		}
	}


