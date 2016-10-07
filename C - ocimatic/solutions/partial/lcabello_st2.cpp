#include <iostream>
#include <vector>

using namespace std;

int main(){
	int n, r = 0;
	vector< vector<int> > m;
	vector<int> v(2);
	cin >> n;
	for(int i=0; i<n; i++){
		cin >> v[0];
		cin >> v[1];
		m.push_back(v);
	}
	for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
			if(i==j)continue;
			if(m[j][0]<=m[i][0]&&m[i][1]<=m[j][1]){
				r++;
				break;
			}
		}
	}
	cout << r << endl;
	return 0;
}