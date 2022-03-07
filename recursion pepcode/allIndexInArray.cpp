#include "bits/stdc++.h"
using namespace std;

// Incomplete
int * allOcc(int a[], int n, int idx, int x,int found_so_far){

	if (idx == n)
	{
		static int* iarr = new int[found_so_far];
		return iarr;          //  where should i use the delete keyword to delete the heap allocate memory.

	}

	if (a[idx] == x)
	{
		int* iarr = allOcc(a,n,idx+1,x,found_so_far+1);
		iarr[found_so_far] = idx;
		return iarr;
	}
	else{
		int* iarr = allOcc(a,n,idx+1,x,found_so_far);
		return iarr;
	}
}

int main(){

	int a[] = {1,2,3,4,5,3};
	int n = sizeof(a)/sizeof(a[0]);
	int * p;

	p = allOcc(a,n,0,3,0);

// i want the size of p so that i can prin the all elements in p.

	int m = sizeof(p)/ sizeof(p[0]); // gives value 1 but the pointer has 2 value.
	
	for (int i = 0; i < m; i++)
	{
		cout<<*(p+i)<<" ";
	}

	return 0;
}