#include <stdio.h>

int main(){
	int n, i, j;
	scanf("%d", &n);
	int x[n], y[n], rank;
	for(i=0;i<n;i++){
		scanf("%d %d", &x[i], &y[i]);
	}
	for(i=0;i<n;i++){
		rank=1;
		for(j=0;j<n;j++){
			if(x[i]<x[j]&&y[i]<y[j]) rank++;
		}
		printf("%d ", rank);
	}
	return 0;
}
