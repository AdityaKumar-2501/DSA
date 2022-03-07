#include<iostream>
using namespace std;

struct Pair {
	int max;
	int min;
};

struct Pair getMinMax(int arr[] , int n){
	
	Pair maxmin;
	
	if(n ==1){
		maxmin.max = arr[0];
		maxmin.min = arr[0];
	}
	
	if(arr[0] > arr[1]){
		maxmin.max = arr[0];
		maxmin.min = arr[1];
	}
	else{
		maxmin.max = arr[1];
		maxmin.min = arr[0];
	}
	
	for(int i = 2; i<n ;i++){
		
		if(arr[i] > maxmin.max)
			maxmin.max = arr[i];

		else if(arr[i]< maxmin.min)
			maxmin.min = arr[i];		
	}
	return maxmin;
}

int main(){

	int arr[] = {1,2,3,4,5,6};
	int size = sizeof(arr)/sizeof(arr[0]);
	Pair ans = getMinMax(arr , size);
	
	cout<<"Maximum number is "<<ans.max<<" and the Minimum number is "<<ans.min<<endl;
	return 0;

return 0;
}

