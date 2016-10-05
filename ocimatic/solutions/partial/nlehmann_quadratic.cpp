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

bool contains(pair<int,int> a, pair<int,int> b) {
  return a.first <= b.first and b.second <= a.second;
}

int main() {
  int N;
  int a, b;
  scanf("%d", &N);
  vector<pair<int,int>> vec(N);
  for (int i = 0; i < N; ++i) {
    scanf("%d%d", &a, &b);
    vec[i] = make_pair(a, b);
  }
  int count = 0;
  for (int i = 0; i < N; ++i)
    for (int j = 0; j < N; ++j)
      if (i != j and contains(vec[j], vec[i])) {
        count++;
        break;
      }
  printf("%d\n", count);
}
