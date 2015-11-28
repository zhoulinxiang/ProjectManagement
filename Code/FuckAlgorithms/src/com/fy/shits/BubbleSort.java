package com.fy.shits;

import static com.fy.shits.Utils.swap;

import java.util.List;

public class BubbleSort {
	@SuppressWarnings("unchecked")
	public static void bubbleSort(Object[] in,int begin,int end){
		for(int i=0;i<end;i++)
			for(int j=in.length-1;j>i;j--)
				if(((Comparable<Object>)in[j]).compareTo(in[j-1])<0)
					swap(in,j-1,j);}
	
	
	public static <T extends Comparable<? super T>> void bSort(T[] input){
        bubbleSort(input,0,input.length);
    }
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<? super T>> void bSort(List<T> input){
		Object[] nSort=input.toArray();
        bubbleSort(nSort,0,nSort.length);
        int i=0;
        for(Object obj:nSort){
        	input.set(i, (T)obj);
        	i++;
        }
    }
}	
