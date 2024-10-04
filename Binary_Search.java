package Recursion;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3332,743,54,65,90,45};
		int x=bsearch(arr,3,0,arr.length-1);
		System.out.println(arr.length);
		System.out.println(x);
	}
	static int bsearch(int arr[],int tar,int start,int end){
		if(start>end) {
			return -1;
		}
		
		int mid=start+(end-start)/2;
		
		if(arr[mid]==tar) {
			return mid;
		}
		
		if(tar<arr[mid]) {
			bsearch(arr,tar,start,mid-1);
		}
		
		return bsearch(arr,tar,mid+1,end);
		
	}
}
