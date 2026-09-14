package com.sriman.classes;

class SearchUtil{
	public static int search(int[] arr, int ele, int pos){
		for(int i = pos;i<arr.length; i++){
			if (arr[i] == ele){
				return i;
			}
		}
		return -1;
	}
	public static int search(int [] arr,int ele){
		return search(arr,ele,0);
	}
}

public class Overloading {
	public static void main(String[] args) {
	
	}
}
