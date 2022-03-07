#include <bits/stdc++.h>
using namespace std;

void displayInRev(int a[], int n, int idx = 0){
	if (idx == n)
	{
		return;
	}

	displayInRev(a,n,idx+1);
	cout<<a[idx]<<" ";
}

int main(){

	int a[] = {1,2,3,4,5};
	int n = sizeof(a)/sizeof(a[0]);

	displayInRev(a,n,0);	
	
	return 0;
}