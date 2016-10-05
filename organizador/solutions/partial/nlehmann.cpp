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

int main()
{
  int H, M, N;
  scanf("%d%d%d", &H, &M, &N);
  int total = 0;
  M += H*60;
  int count = 0;
  for (int i = 0; i < N; ++i) {
    int mi, si;
    scanf("%d%d", &mi, &si);
    total += mi;
    if (total <= M)
      count++;
  }
  printf("%d\n", count);
	return 0;
}
