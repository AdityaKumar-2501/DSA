#include <bits/stdc++.h>
using namespace std;

void displayArray(int a[], int n, int idx=0){
	if (idx == n)
	{
		return;
	}
	cout<<a[idx]<<" ";
	displayArray(a,n,idx+1);
}


int main(){

	int a[] = {1,2,3,4,5};
	int n = sizeof(a)/sizeof(a[0]);

	displayArray(a,n,0);	
	
	return 0;
}