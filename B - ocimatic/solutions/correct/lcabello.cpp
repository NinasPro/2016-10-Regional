#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
	int n, r = 0, d = 0;
	vector< vector<int> > m;
	vector<int> v(2);
	cin >> n;
	for(int i=0; i<n; i++){
		cin >> v[0] >> v[1];
		m.push_back(v);
	}
	sort(m.begin(), m.end(), [](vector<int> &l, vector<int> &r){return l[0]<r[0]||(l[0]==r[0]&&l[1]>r[1]);});
	for(int i=0; i<n; i++){
		if(d<m[i][1])d = m[i][1];
		else r++;
	}
	cout << r << endl;
	return 0;
}