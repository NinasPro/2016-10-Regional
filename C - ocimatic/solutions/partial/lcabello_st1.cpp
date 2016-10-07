#include <iostream>
#include <vector>

using namespace std;

int main(){
	int n, a, b, c, d;
	cin >> n;
	cin >> a >> b;
	if(n == 1){
		cout << 0 << endl;
	}
	else{
		cin >> c >> d;
		if((a<=c && d<=b) || (c<=a && b<=d)){
			cout << 1 << endl;
		}
		else{
			cout << 0 << endl;
		}
	}
	return 0;
}