#include<iostream>
using namespace std;

void moveLeft(int arr[] , int n ){
	int j = 0;
	for(int i = 0 ; i< n ;i++){
		if(arr[i] < 0){
			if(i != j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++; 
			}
		}
	}
}


void printArray(int arr[], int n){
	for(int i = 0 ; i < n ; i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

int main(){

	int arr[] = {1,2,-3,2,-9,4,-2,12,21,-1,-4,-7};
	int n = sizeof(arr)/sizeof(arr[0]);
	
	printArray(arr,n);
	moveLeft(arr,n);
	printArray(arr,n);

return 0;
}

