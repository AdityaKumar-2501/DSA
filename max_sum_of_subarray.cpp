#include<iostream>
#include<climits>
using namespace std;

//   Kadane's Algorithm

int maxSumSubarray(int a[] , int n){
	int max_so_far = INT_MIN;
	int max_ending_here = 0;
	
	for(int i = 0 ; i<n ; i++){
		max_ending_here += a[i];
		
		if(max_so_far < max_ending_here){
			max_so_far = max_ending_here;
		}
		
		if(max_ending_here < 0)
			max_ending_here = 0;
	}
	
	return max_so_far;
	
}

int main(){

	int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
	int n = sizeof(a)/sizeof(a[0]);
	
	cout<<"Maximum sum of contigous subarray is "<<maxSumSubarray(a,n);

	return 0;
}

