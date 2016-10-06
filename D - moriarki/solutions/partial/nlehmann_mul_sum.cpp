/*
 * -----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <nlehmann@dcc.uchile.cl> wrote this file. As long as you retain this notice
 * you can do whatever you want with this stuff. If we meet some day, and you
 * think this stuff is worth it, you can buy me a beer in return Nicolás Lehmann
 * -----------------------------------------------------------------------------
 */

#include <cstdio>
using namespace std;


int main () {
  int N, a;
  scanf("%d", &N);

  int i;
  int res = 1;
  for (i = 0; i < N; ++i) {
    scanf("%d", &a);
    res *= a;
    if (i < N - 1) {
      scanf("%d", &a);
      if (a == 0) {
        i++;
        break;
      }
    }
  }
  for (; i < N; ++i) {
    scanf("%d", &a);
    res += a;
    if (i < N - 1)
      scanf("%d", &a);
  }
  printf("%d\n", res);
}

