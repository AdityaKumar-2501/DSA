#include<iostream>
using namespace std;

int firstocc(int a[], int n, int i, int key){
	if(i == n){
		return -1;
	}
	
	if(a[i]==key){
		return i;
	}
	
	return firstocc(a,n,i+1,key);
}

int lastocc(int a[] , int n, int i , int key){
	if( i== n){
		return -1;
	}
	
	int restArray = lastocc(a,n,i+1,key);
	
	if(restArray == -1){
		if(a[i] == key){
			return i;
		}
		else{
			return -1;
		}
	}
	else{
		return restArray;
	}
}

int main(){

	int a[] = {1,2,3,4,5,2,6};
	int n  = sizeof(a)/sizeof(a[0]);
	
	cout<<firstocc(a,n,0,2)<<endl;
	cout<<lastocc(a,n,0,2)<<endl;

	return 0;
}

