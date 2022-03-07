#include<iostream>
using namespace std;

bool check(int a[] , int n){
	
	if(n==1){
		return 1;
	}
	int restArray = check(a+1, n-1);
	return (a[0]<a[1] && restArray);
	
}


int main(){
	int a [] = {1,2,3,4,5,6};
	int n = sizeof(a)/sizeof(a[0]);
	
	cout<<check(a,n);
	
	return 0;
}

