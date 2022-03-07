#include<iostream>
using namespace std;

int count(int n ,int m){
	if(n ==1 || m ==1)
		return 1;
	
	return count(n-1, m) + count(n, m-1);
}


int main(){

	int n = 4, m= 3;
	
	cout<<"Total Number of paths in "<<n<<"x"<<m<<" matrix is "<<count(n,m);

	return 0;
}

