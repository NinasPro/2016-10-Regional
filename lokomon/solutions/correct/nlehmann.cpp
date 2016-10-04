/*
 * -----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <nlehmann@dcc.uchile.cl> wrote this file. As long as you retain this notice
 * you can do whatever you want with this stuff. If we meet some day, and you
 * think this stuff is worth it, you can buy me a beer in return Nicolás Lehmann
 * -----------------------------------------------------------------------------
 */

#include <vector>
#include <algorithm>
#include <cstdio>
#include <climits>
using namespace std;

int N, M;
vector<vector<int>> neighbors;

int subtask1() {
  vector<int> total(N);
  for (int i = 0; i < M; ++i)
    total[neighbors[i][0]-1]++;
  return max_element(total.begin(), total.end()) - total.begin() + 1;
}

int subtask2() {
  vector<int> total(N);
  for (int i = 0; i < M; ++i) {
    total[neighbors[i][N-1]-1]++;
  }
  return max_element(total.begin(), total.end()) - total.begin() + 1;
}

int subtask3() {
  vector<int> total(N);
  for (int i = 0; i < M; ++i)
    for (int j = 0; j < N; ++j)
      total[neighbors[i][j] - 1] += N - j;
  return max_element(total.begin(), total.end()) - total.begin() + 1;
}

int subtask4 () {
  while (N > 1) {
    vector<int> total(150, INT_MAX);
    for (int i = 0; i < M; ++i)
      for (int j = 0; j < N; ++j)
        if (total[neighbors[i][j] - 1] == INT_MAX)
          total[neighbors[i][j] - 1] = N - j - 1;
        else
          total[neighbors[i][j] - 1] += N - j - 1;

    // int mini = min_element(total.begin(), total.end()) - total.begin();
    int mini = 0;
    for (int i = 0; i < 150; ++i)
      if (total[i] <= total[mini])
        mini = i;

    for (int i = 0; i < M; ++i)
      remove(neighbors[i].begin(), neighbors[i].end(), mini + 1);

    N--;
  }
  return neighbors[0][0];
}

int main() {
  int S;
  scanf("%d%d%d", &S, &N, &M);

  neighbors.resize(M, vector<int>(N));
  for (int i = 0; i < M; ++i)
    for (int j = 0; j < N; ++j)
      scanf("%d", &neighbors[i][j]);

  switch (S) {
  case 1: printf("%d\n", subtask1()); break;
  case 2: printf("%d\n", subtask2()); break;
  case 3: printf("%d\n", subtask3()); break;
  case 4: printf("%d\n", subtask4()); break;
  }

  return 0;
}
