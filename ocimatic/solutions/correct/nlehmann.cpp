/*
 * -----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <nlehmann@dcc.uchile.cl> wrote this file. As long as you retain this notice
 * you can do whatever you want with this stuff. If we meet some day, and you
 * think this stuff is worth it, you can buy me a beer in return Nicolás Lehmann
 * -----------------------------------------------------------------------------
 */

#include <algorithm>
#include <vector>
#include <cstdio>
using namespace std;

int main() {
  int N;
  int a, b;
  scanf("%d", &N);
  vector<pair<int,int>> vec(N);
  for (int i = 0; i < N; ++i) {
    scanf("%d%d", &a, &b);
    vec[i] = make_pair(a, -b);
  }
  sort(vec.begin(), vec.end());

  int count = 0;
  int rightmost = -1;
  for (auto p : vec) {
    a = p.first;
    b = -p.second;
    if (b > rightmost)
      rightmost = b;
    else
      count++;
  }
  printf("%d\n", count);
}
