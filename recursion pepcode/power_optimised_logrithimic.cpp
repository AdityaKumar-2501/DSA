#include <bits/stdc++.h>
using namespace std;


int powerOpt(int x, int n){
	if (n == 0)
	{
		return 1;
	}

	if (n%2 == 0)
	{
		return powerOpt(x,n/2) * powerOpt(x,n/2);
	}
	else
		return powerOpt(x,n/2) * powerOpt(x,n/2) * x;
}


int main(){

	int n,x;
	cin>>x>>n;

	cout<<powerOpt(x,n);	
	
	return 0;
}