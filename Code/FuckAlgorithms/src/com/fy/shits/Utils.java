package com.fy.shits;

public class Utils {
	static void swap(Object[] in,int indexA,int indexB){
		Object temp=in[indexA];
		in[indexA]=in[indexB];
		in[indexB]=temp;
	}
}
