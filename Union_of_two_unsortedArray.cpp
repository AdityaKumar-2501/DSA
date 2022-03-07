#include<bits/stdc++.h>
using namespace std;

int main(){

	int a[] = {1,3,2,5,5,3};
	int b[] = {1,4,2};
	int n = 4 , m = 3;
	
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
	return 0;
}

