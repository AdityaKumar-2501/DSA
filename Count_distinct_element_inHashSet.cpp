#include<bits/stdc++.h>
using namespace std;

int main(){

	int arr[] ={2,1,5,2,6,1};
	int n = sizeof(arr)/sizeof(arr[0]);

	set<int> s;
	
	for(int i = 0 ; i<n; i++){
		s.insert(arr[i]);
	}
	
//	set<int>::iterator it;
	
	for(auto it = s.begin() ; it!=s.end();it++){
		cout<<*it<<" ";
	}
	cout<<endl;
	
	cout<<s.size()<<endl;
	return 0;
}

