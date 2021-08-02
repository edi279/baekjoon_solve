#include <iostream>
#include <cstdio>
#include <string>
#include <algorithm>
using namespace std;
int check(int *arr, int n){
	int max=0;
	for(int i=2;i<n;i++){
		if(arr[i]-arr[i-2]>max) max=arr[i]-arr[i-2];
	}
	return max;
}
int main(){
	int t, n, count;
	scanf("%d", &t);
	int test[t];
	for(count=0;count<t;count++){
		scanf("%d", &n);
		int l[n];
		for(int i=0;i<n;i++){
			scanf("%d", &l[i]);
		}
		sort(l, l+n);
		test[count]=check(l, n);
	}
	for(int i=0;i<t;i++){
		printf("%d\n", test[i]);
	}
}
