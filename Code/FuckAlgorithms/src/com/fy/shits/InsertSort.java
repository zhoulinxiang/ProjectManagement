package com.fy.shits;

import java.util.List;

public class InsertSort {
	
	private static void insertSort(Object[] in,int begin,int end){
		for(int i=1;i<end;i++){
			@SuppressWarnings("unchecked")
			Comparable<Object> key=(Comparable<Object>) in[i];
			int j=i-1;
			while(j>=0&&key.compareTo(in[j])<0){
				in[j+1]=in[j];
				j=j-1;
			}
			in[j+1]=key;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<? super T>> void ISort(List<T> input){
		Object[] nSort=input.toArray();
		insertSort(nSort,0,nSort.length);
        int i=0;
        for(Object obj:nSort){
        	input.set(i, (T)obj);
        	i++;
        }
	}
}
