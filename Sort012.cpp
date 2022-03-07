#include<iostream>
using namespace std;

// simple way

void sort012(int arr[] , int n){
	int count0 = 0, count1 =0 , count2= 0;
	
	for(int i = 0 ; i < n ;i++){
		if(arr[i] == 0)
			count0++;
		else if(arr[i] == 1)
			count1++;
		else if(arr[i] == 2)
			count2++;
	}
	// adding 0 to array
	for(int i = 0 ;i < count0 ; i++){
		arr[i] = 0;
	}
	
	// adding 1 to array
	for(int i = count0 ;i < (count0+ count1) ; i++){
		arr[i] = 1;
	}
	
	//adding 2 to array
	for(int i = (count0+count1); i < n ; i++){
		arr[i] = 2;
	}
}


void printArray(int arr[], int n){
	for(int i = 0 ; i < n ; i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}
int main(){

	int arr[] = {0,0,0,1,0,1,0,2,1,2,0,0,2,0,1,2,0,2,0,1,0,1,0,2,0};
	int n = sizeof(arr)/sizeof(arr[0]);
	
	printArray(arr,n);
	sort012(arr,n);
	printArray(arr,n);

return 0;
}

