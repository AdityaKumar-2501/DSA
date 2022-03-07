#include <bits/stdc++.h>
using namespace std;

int lastOcc(int a[], int n, int idx , int x){

	if (idx == n)
	{
		return -1;
	}

	int lastIndex_so_far = lastOcc(a,n,idx+1,x);
	if (lastIndex_so_far == -1)
	{
		if (a[idx] == x)
		{
			return idx;
		}
		else
			return -1;
	}
	else
		return lastIndex_so_far;
}

int main(){
	
	int a[] = {1,2,3,4,5,4,3,2,1,2,3};
	int n = sizeof(a)/sizeof(a[0]);

	cout<<lastOcc(a,n,0,2);
	return 0;
}