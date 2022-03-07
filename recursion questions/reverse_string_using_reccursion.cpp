#include <bits/stdc++.h>
using namespace std;

void reverse(string s, int idx){
	if(idx == s.size())
		return;

	reverse(s, idx+1);
	cout<<s[idx];
}

int main() {
    reverse("abcd", 0);
}