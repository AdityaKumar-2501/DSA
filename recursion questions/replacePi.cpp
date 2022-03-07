#include <bits/stdc++.h>
using namespace std;

void replacePi(string s, int idx){
	if (idx==s.size())
		return;

	if(s[idx] == 'p' && s[idx+1] == 'i'){
		cout<<"3.14";
		replacePi(s,idx+2);
	}
	else{
		cout<<s[idx];
		replacePi(s,idx+1);
	}
}

int main(){
	cout<<"pippippiiiipiiippippiii"<<endl;
	replacePi("pippippiiiipiiippippiii", 0);
	return 0;
}