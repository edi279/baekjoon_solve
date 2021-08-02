#include <iostream>
#include <cstdio>
#include <string>
#include <algorithm>
#include <vector>
using namespace std;

bool comp(const string &s1, const string &s2){
	return s1 < s2;
}
int main(){
	vector<string> np;
	vector<string> same;
	char people[21];
	int i, j, n, m, count=0;
	scanf("%d %d", &n, &m);
	for(i=0;i<n;i++){
		scanf("%s", people);
		string str(people);
		np.push_back(str);
	}
	sort(np.begin(), np.end(), comp);
	for(i=0;i<m;i++){
		scanf("%s", people);
		string str(people);
		if(binary_search(np.begin(), np.end(), str)){
			same.push_back(str);
			count++;
		}
	}
	sort(same.begin(), same.end(), comp);
	printf("%d\n", count);
	for(i=0;i<count;i++){
		printf("%s\n", same[i].c_str());
	}
}
