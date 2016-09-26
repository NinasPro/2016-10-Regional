#include <stdio.h>


int main () {
    int th, tm, ts, sn, sm, ss, sc;

    scanf("%d%d%d", &th, &tm, &sn);
    ts = th * 3600 + tm * 60;

    for (sc = 0; sc < sn; sc++) {
        scanf("%d%d", &sm, &ss);
        ts -= 60 * sm + ss;
        if (ts < 0)
            break;
    }

    printf("%d\n", sc);
    return 0;
}
