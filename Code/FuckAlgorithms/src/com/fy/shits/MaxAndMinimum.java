package com.fy.shits;

import java.util.*;
public class MaxAndMinimum<E>{
	Collection<Integer> collection;
	public MaxAndMinimum(Collection<Integer> collection){
		if(collection==null||collection.isEmpty()) throw new IllegalArgumentException();
		this.collection=collection;
	}
	
	public int getMax(){
		Iterator<Integer> iter=this.collection.iterator();
		int maxNum=java.lang.Integer.MIN_VALUE;
		while(iter.hasNext()){
			int tempNum=(int) iter.next();
			if(tempNum>maxNum)
				maxNum=tempNum;
		}
		return maxNum;
	}
	
	public int getMin(){
		Iterator<Integer> iter=this.collection.iterator();
		int minNum=java.lang.Integer.MAX_VALUE;
		while(iter.hasNext()){
			int tempNum=(int) iter.next();
			if(tempNum<minNum)
				minNum=tempNum;
		}
		return minNum;
	}
	
	public Map<String,Integer> getMaxAndMin(){
		Map<String,Integer> rMap=new HashMap<String,Integer>();
		int maxNum,minNum;
//		Iterator<Integer> iter=this.collection.iterator();
		Object[] array=this.collection.toArray();
		if(array.length%2==0){
			if((int)array[0]>=(int)array[1]){
				maxNum=(int) array[0];
				minNum=(int) array[1];
			}
			else{
				maxNum=(int) array[1];
				minNum=(int) array[0];
			}
			for(int i=2,j=3;j<array.length;i+=2,j+=2){
				int tempj=(int)array[j];
				int tempi=(int)array[i];
				if(tempj>=tempi){
					if(tempj>=maxNum){
						maxNum=tempj;
					}
					if(tempi<=minNum){
						minNum=tempi;
					}
				}
				else{
					if(tempi>=maxNum){
						maxNum=tempi;
					}
					if(tempj<=minNum){
						minNum=tempj;
					}
				}
			}
		}
		else{
			maxNum=(int) array[0];
			minNum=(int) array[0];
			for(int i=1,j=2;j<array.length;i+=2,j+=2){
				int tempj=(int)array[j];
				int tempi=(int)array[i];
				if(tempj>=tempi){
					if(tempj>=maxNum){
						maxNum=tempj;
					}
					if(tempi<=minNum){
						minNum=tempi;
					}
				}
				else{
					if(tempi>=maxNum){
						maxNum=tempi;
					}
					if(tempj<=minNum){
						minNum=tempj;
					}
				}
			}
		}
		rMap.put("Max", maxNum);
		rMap.put("Min", minNum);
		
		return rMap;
	}
	
	public static void main(String[] args){
		Random rand=new Random();
		ArrayList<Integer> test=new ArrayList<Integer>();
		for(int i=0;i<10000;i++){
			test.add(rand.nextInt(10000));
		}
//		Integer[] objs=new Integer[test.size()];
//		for(int i=0;i<test.size();i++){
//			objs[i]=test.get(i);
//		}
		MaxAndMinimum<Integer> fuck=new MaxAndMinimum<Integer>(test);
		System.out.println(fuck.getMax());
		System.out.println(fuck.getMin());
		Map<String,Integer> shitMap=fuck.getMaxAndMin();
		System.out.println(shitMap.get("Max"));
		System.out.println(shitMap.get("Min"));
//		test.sort(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				if(o1<o2)
//					return -1;
//				else if(o1==o2) 
//					return 0;
//				else
//					return 1;
//			}
//		});;
//		System.out.println("Min="+test.get(0)+","+"Max="+test.get(test.size()-1));
		double timea=System.currentTimeMillis();
//	QuickSort.qSort(test);
		InsertSort.ISort(test);
		
//		BubbleSort.bSort(test);
		double timeb=System.currentTimeMillis();
		System.out.println((timeb-timea)+"ms");
		System.out.println(test);
	}
	
}
