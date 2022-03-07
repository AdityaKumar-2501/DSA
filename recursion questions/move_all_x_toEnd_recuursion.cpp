#include <bits/stdc++.h>
using namespace std;

string moveAll(string s, int idx =0){
	if(idx == s.size())
		return "";
	char ch = s[idx];
	string ans = moveAll(s, idx+1);
	if(ch == 'x'){
		return (ans+ch);
	}
	return (ch + ans);
}

int main(){
	
	cout<<moveAll("xxxxxxxxxasaas", 0);
	return 0;
}