#include <bits/stdc++.h>
using namespace std;

void pdi(int n){
	if (n==0)
	{
		return;
	}

	cout<<n<< " ";
	pdi(n-1);
	cout<<n<<" ";
}


int main(){
	
	int n;
	cin>>n;

	pdi(n);

	return 0;
}