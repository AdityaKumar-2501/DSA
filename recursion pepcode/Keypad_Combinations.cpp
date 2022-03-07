#include <bits/stdc++.h>
using namespace std;
// Incomplete
int codes[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

vector<string> getKeyComb(string n){
	if (n.size() == 0)
	{
		vector<string> ans;
		ans.push_back("");
		return ans;
	}

	char ch = n[0];
	string ros = n.substr(1);

	vector<string> res = getKeyComb(ros);
	vector<string> mres;

	string codeforch = codes[ch - '0'];
	for (int i = 0; i < codeforch.size(); i++)
	{
		char chcode = codeforch[i];
		for(string rstr : res){
			mres.push_back(chcode + rstr);
		}
	}

	return mres;
}


int main(){
	
	string n;
	cout<<"Enter the key: ";
	cin>>n;

	vector<string> v;
	v = getKeyComb(n);

	for (auto i = v.begin(); i != v.end(); ++i)
	{
		cout<<*i<<" ";
	}

	return 0;
}