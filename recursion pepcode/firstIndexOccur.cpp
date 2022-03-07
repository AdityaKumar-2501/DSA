#include <bits/stdc++.h>
using namespace std;

int firstOcc(int a[], int n, int idx, int x){

	if (idx == n)
	{
		return -1;
	}

	if (a[idx] == x)
	{
		return idx;
	}
	else{
		return firstOcc(a,n,idx+1,4);
	}
}


int main(){
	
	int a[] = {1,2,3,4,5,4,3,2,1};
	int n = sizeof(a)/sizeof(a[0]);	

	cout<<firstOcc(a,n,0,4);
	return 0;
}