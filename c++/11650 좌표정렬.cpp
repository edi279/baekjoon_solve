#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <utility>
using namespace std;
bool comp(const pair<int, int> &p1, const pair<int, int> &p2){
	if(p1.first==p2.first) return p1.second<p2.second;
	else return p1.first<p2.first;
}
int main(){
	int n, i;
	scanf("%d", &n);
	int x, y;
	vector<pair<int, int> > p(n);
	for(i=0;i<n;i++){
		scanf("%d %d", &p[i].first, &p[i].second);	
	}
	sort(p.begin(), p.end(), comp);
	for(i=0;i<n;i++){
		printf("%d %d\n", p[i].first, p[i].second);
	}
}
