package com.fy.shits;

import java.util.List;
import static com.fy.shits.Utils.swap;

public class QuickSort{
	
	
	@SuppressWarnings("unchecked")
	private static int partition(Object[] in,int begin,int end){
		Object x=in[end-1];
		int i=begin-1;
		for(int j=begin;j<end-1;j++){
			if(((Comparable<Object>)in[j]).compareTo(x) <= 0){
				i++;
				swap(in,i,j);
			}
		}
		swap(in,i+1,end-1);
		return i+1;
	}
	private static void quickSort(Object[] in,int begin,int end){
		if(begin<end){
			int q=partition(in,begin,end);
			quickSort(in,begin,q);
			quickSort(in,q+1,end);
		}
	}
	
	
	public static <T extends Comparable<? super T>> void qSort(T[] input){
        quickSort(input,0,input.length);
    }
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<? super T>> void qSort(List<T> input){
		Object[] nSort=input.toArray();
        quickSort(nSort,0,nSort.length);
        int i=0;
        for(Object obj:nSort){
        	input.set(i,(T)obj);
        	i++;
        }
    }
}
