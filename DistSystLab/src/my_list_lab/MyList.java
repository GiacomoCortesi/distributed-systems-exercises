package my_list_lab;

/* The goal of this activity is to create your own int List class, calling it myList */

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private List<Integer> list;
	
	public MyList(){
		list = new ArrayList<Integer>();
	}
	
	public MyList(List<Integer> toCopy){
		list = toCopy;
	}
	public void myInsert(int add){
		list.add(add);
	}
	public int mySize(){
		return list.size();
	}
	public void myEmpty(){
		list.clear();
	}
	public void myDelete(int del){
		list.remove(del);
	}
	public String toString(){
		return list.toString();
	}
	public boolean myFindOut(int el){
		return list.contains(el);
	}
	public int mySum(){
		int sum = 0;
		for(int i = 0;i<list.size();i++)
		{
			sum = list.get(i)+sum;
		}
		return sum;
	}
	public boolean evenTail(){
		int size = list.size();
		if(list.get(size-1)%2==0){
			return true;
		}
		return false;
	}
	public int[] minMax(){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++){
			if (list.get(i)<min){
				min = list.get(i);
			}
			if (list.get(i)>max)
			{
				max = list.get(i);
			}
		}
		int[] minMaxVec;
		minMaxVec = new int[2];
		minMaxVec[0] = min;
		minMaxVec[1] = max;
		return minMaxVec;
	}
	public int myDeleteLastN(int n){
		int m = 0;
		for(int i=1;i<=n;i++){
			list.remove(list.size()-i);
			m++;
			if(list.isEmpty()){
				break;
			}
		}
		return m;
	}
	
	public int mySaveFirstN(int n){
		if(n>list.size()){
			return 0;
		}
		else{
			for(int i=n; i<list.size();i++){
				list.remove(i);
			}
			return this.mySize()-n;
		}
	}
	
	
	public void myMoveHeadToTail()
	{
		int app;
		app = list.get(0);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, app);
	}
	
	public void myDeleteEOrO(boolean eOrO){
		if(eOrO){
			for(int i=0;i<list.size();i++){
				this.myDelete(i);
			}
		}else{
			for(int i=1;i<list.size();i++){
				this.myDelete(i);
			}
		}
	}
}
