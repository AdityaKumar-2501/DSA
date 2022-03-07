#include <bits/stdc++.h>
using namespace std;

vector<string> gmp(int sr, int sc, int dr, int dc){
    		if (sr == dr && sc == dc) {
			vector<string> bres ;
			bres.push_back("");
			return bres;
		}
		
		vector<string> hpath ;
		vector<string> vpath ;
		vector<string> mres ;

		if (sr < dr) {
			hpath = gmp(sr+1,sc,dr,dc);
		}
		if (sc< dc) {
			vpath = gmp(sr,sc+1,dr,dc);
		}

		for (string res : hpath) {
			mres.push_back("h" + res);
		}
		for (string res: vpath) {
			mres.push_back("v" + res);
		}

		return mres;
}


int main()
{
    vector<string> ans = gmp(1,1,3,3);
    cout<<"Total number of paths : "<<ans.size()<<endl;
    
    for (auto i : ans) {
        cout<<i<<" ";
    }

    return 0;
}