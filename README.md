# neobis

---

![Java backend](https://media.geeksforgeeks.org/wp-content/uploads/20230920172106/Why-to-Choose-Java-For-Backend-Development.png)

---

## Study Plan

---

### 1. Solved Problems

- Here we go!

#### Example of solved problem in C++

[link to the problem](https://codeforces.com/contest/1923/problem/D)

```C++

#include <bits/stdc++.h>

#define long long long
#define mk make_pair
#define fr first
#define sc second

using namespace std;

typedef pair<int,int> pii;
const int inf = 1e9 + 7;
const int N = 5e5 + 5;

long pref[N], suff[N];
int peq[N], seq[N];
int a[N], b[N];
int n;
bool flag = false;

bool func(int pivot, int m) {
    int l = max(1, pivot - m), r = min(n, pivot + m);
    long lsum = suff[l] - suff[pivot];
    long rsum = pref[r] - pref[pivot];
    int le = seq[l] - seq[max(1, pivot - 1)] + (l != pivot - 1);
    int re = peq[r] - peq[min(n, pivot + 1)] + (r != pivot + 1);
    if (lsum > a[pivot] && le < pivot - l) return true;
    if (rsum > a[pivot] && re < r - pivot) return true;
    return false;
}

void solve() {
    cin >> n;
    a[n + 1] = 0;
    suff[n + 1] = 0;
    pref[n + 1] = 0;
    seq[n + 1] = peq[n + 1] = 0;
    for (int i = 1; i <= n; i++) {
        cin >> a[i];
        pref[i] = a[i] + pref[i - 1];
        peq[i] = (a[i] == a[i - 1]) + peq[i - 1];
    }
    for (int i = n; i >= 1; i--) {
        suff[i] = a[i] + suff[i + 1];
        seq[i] = (a[i] == a[i + 1]) + seq[i + 1];
    }
    for (int i = 1; i <= n; i++) {
        int l = 0, r = n + 1;
        flag = (i == 3);
        while (r - l > 1) {
            int m = (l + r) / 2;
            if (func(i, m)) r = m;
            else l = m;
        }
        if (a[i] < a[i + 1] || a[i] < a[i - 1]) b[i] = 1;
        else if (func(i, l)) b[i] = l;
        else if (func(i, r)) b[i] = r;
        else {
            b[i] = -1;
        }
    }
    for (int i = 1; i <= n; i++) {
        cout << b[i] << " ";
    }
    cout << endl;
}

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);
    int t = 1;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}

```

---

- `author` - Aibek Bakirov
- `date` - 26.02.2024
