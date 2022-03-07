#include<bits/stdc++.h>
using namespace std;

int main(){

	int a[] = {1,3,1,2,5,5,3};
	int b[] = {1,4,2,1};
	int n = 4 , m = 3;
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
	return 0;
}

