package com.srimannr.hackerrank.java;

import java.util.*;

public class JavaDequeSolution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		Deque<Integer> window = new ArrayDeque<>();
		Map<Integer, Integer> freq = new HashMap<>();
		
		int maxUnique = 0;
		
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			window.addLast(num);
			freq.put(num, freq.getOrDefault(num, 0) + 1);
			
			if (window.size() == m) {
				maxUnique = Math.max(maxUnique, freq.size());
				
				// Slide the window
				int removed = window.removeFirst();
				freq.put(removed, freq.get(removed) - 1);
				if (freq.get(removed) == 0) {
					freq.remove(removed);
				}
			}
		}
		
		System.out.println(maxUnique);
	}
}