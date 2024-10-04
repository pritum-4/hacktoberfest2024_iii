package Hashing;
import java.util.*;
public class Majority_Element{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,5,1,3,1,5,1};
		fun(arr);
	}
	
	static void fun(int arr[]) {
		HashMap<Integer,Integer> map= new HashMap<>();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		for(int key : map.keySet()) {
			if(map.get(key)>n/3) {
				System.out.println(key);
			}
		}
		
	}
}
