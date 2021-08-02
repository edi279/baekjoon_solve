#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main(){
	int n, min=0;
	scanf("%d", &n);
	int p[n];
	for(int i=0;i<n;i++){
		scanf("%d", &p[i]);
	}
	sort(p, p+n);
	for(int i=0;i<n;i++){
		for(int j=0;j<=i;j++){
			min+=p[j];
		}
	}
	printf("%d", min);
}
