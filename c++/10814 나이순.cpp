#include <iostream>
#include <cstdio>
#include <algorithm>

using namespace std;

typedef struct member {
	int age;
	char name[101];
} mlist;
mlist m[100000];
bool old(mlist a, mlist b){
	return a.age < b.age;
}
int main(){
	int n;
	scanf("%d", &n);
	for(int i=0;i<n;i++){
		scanf("%d %s", &m[i].age, &m[i].name);
	}
	stable_sort(m, m+n, old);
	for(int i=0;i<n;i++){
		printf("%d %s\n", m[i].age, m[i].name);
	}
	return 0;
}
