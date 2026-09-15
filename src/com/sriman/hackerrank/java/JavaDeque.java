package com.sriman.hackerrank.java;

import java.util.*;
public class JavaDeque {
	//    public static int getUnique(int arr[]){
//        boolean num[] = new boolean[10];
//        for (int ele:arr){
//            num[ele] = true;
//        }
//        int total = 0;
//        for(boolean ele:num){
//            if (ele) total +=1;
//        }
//        return total;
//    }
	public static int getUnique(int arr[]){
		Set<Integer> set = new HashSet<>();
		for (int ele : arr) {
			set.add(ele);
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.addLast(num);
		}
		int arr[] = new int[m];
		for(int j = 0;j< m;j++){
			int ele = (int)deque.getFirst();
			arr[j] = ele;
			deque.removeFirst();
		}
		int unique = 0;
		int start = 0;
		for (int i =0; i< n+1-m;i++){
			int no_unique = getUnique(arr);
			if (no_unique == m){
				System.out.println(m);
				return;
			}
			else if (no_unique > unique){
				unique = no_unique;
			}
			if(i == n+1-m) continue;
			if (!deque.isEmpty()) {
				arr[start] = (int)deque.removeFirst();
				start = (start + 1) % m;
			}

		}
		System.out.println(unique);
		
	}
}
