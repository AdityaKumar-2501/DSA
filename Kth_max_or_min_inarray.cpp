#include<iostream>
#include <bits/stdc++.h>
using namespace std;


int main(){

	int arr[] = {2,1,4,2,68,6,4,3,52,34,45,21,2,54,67,78,43,2321,0,43,45,21,42};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	sort(arr, arr+n);
	
	for(int i = 0 ; i < n ; i ++){
		cout<<arr[i]<<" ";
	} 

	return 0;
}

