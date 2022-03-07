#include <bits/stdc++.h>
using namespace std;

void toh(int n, char s, char d, char h){
	if (n == 0)
	{
		return;
	}

	toh(n-1, s, h,d);
	cout<<n<<"["<<s<<" -> "<<d<<"]"<<endl;
	toh(n-1,h,d,s);
}

int main(){

	int n;
	cout<<"Number of disks: ";
	cin>>n;

	toh(n,'S','D','H');
	
	return 0;
}