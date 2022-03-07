#include<bits/stdc++.h>
using namespace std;

void printIntersection(int a[], int b[], int n,int m){
	int count= 0;
	set<int> s;
	
	// adding elemets of array a into set
	for(int i = 0; i< n ; i++){
		s.insert(a[i]);
	}
	
	for(int i =0; i<m ;i++){
		if(s.find(b[i]) != s.end()){
			count++;
			s.erase(b[i]);	
		}
	}

	cout<<count;
}


void printUnion(int a[], int b[], int n, int m){
	set<int> s;
	
	// adding elemets of array a into set
	for(int i = 0; i< n ; i++){
		s.insert(a[i]);
	}

	//adding elemets of array b into set
	for(int i = 0 ;i <m ; i++){
		s.insert(b[i]);
	}
	
	cout<<s.size();
}

void printArray(int a[], int n){
	for(int i = 0; i<n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}


int main(){

	int a[] = {1,3,2,6,3};
	int b[] = {2,1,4,3,2,5,2,1};
	
	int n = sizeof(a)/sizeof(a[0]);
	int m = sizeof(b)/sizeof(b[0]);
	printArray(a,n);
	printArray(b,n);
	cout<<"Union of two array : ";
	printUnion(a,b,n,m);
	cout<<endl;
	cout<<"Intersection of two Array : ";
	printIntersection(a,b,n,m);

	return 0;
}

