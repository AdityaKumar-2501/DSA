#include<iostream>
using namespace std;

void rotate(int a[], int n){
//	first method 
//	int x = a[n-1];
//	for(int i = n-1 ; i>0 ;i--){
//		a[i] = a[i-1];
//	}
//	a[0] = x;
	
//	Second method

	int i = 0 , j =n-1;
	
	while(i != j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		i++;
	}
}


int main(){

	int a[] = {1,2,3,4,5};
	int n = sizeof(a)/sizeof(a[0]);
	
	cout<<"Before rotation : ";
	for(int i = 0 ; i < n; i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
	
	rotate(a,n);
	
	cout<<"After rotation : ";
	for(int i = 0 ; i < n; i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;

	return 0;
}

