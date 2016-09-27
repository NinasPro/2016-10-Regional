#include <iostream>


using namespace std;

int main () {
    int th, tm, ts, sn, sm, ss, sc;

    cin >> th >> tm >> sn;
    ts = th * 3600 + tm * 60;

    for (sc = 0; sc < sn; sc++) {
        cin >> sm >> ss;
        ts -= 60 * sm + ss;
        if (ts < 0)
            break;
    }

    cout << sc << endl;
    return 0;
}
