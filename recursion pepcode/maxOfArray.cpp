#include <bits/stdc++.h>
using namespace std;

int maxoOfArray(int a[], int n , int idx){

	if (idx == n-1)
	{
		return a[idx];
	}

	int max_so_far = maxoOfArray(a,n,idx+1);

	if (max_so_far > a[idx])
	{
		return max_so_far;
	}
	else{
		return a[idx];
	}
}

int main(){
	
	int a[] = {22,33,1,4,5};
	int n = sizeof(a)/sizeof(a[0]);
	
	cout<<maxoOfArray(a,n,0);
	return 0;
}