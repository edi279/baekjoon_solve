#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main(){
	int n, i, j, k=0, count=0, same;
	scanf("%d", &n);
	int nn=n*n;
	int a[n], b[n], c[n], d[n];
	int sum1[nn], sum2[nn];
	for(int i=0;i<n;i++){
		scanf("%d %d %d %d", &a[i], &b[i], &c[i], &d[i]);
	}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			sum1[k]=a[i]+b[j];
			sum2[k]=c[i]+d[j];
			k++;
		}
	}
	sort(sum1, sum1+nn);
	sort(sum2, sum2+nn);
	/*for(i=0;i<nn;i++){
		printf("%d ", sum2[i]);
	} printf("\n");
	for(i=0;i<nn;i++){
		printf("%d ", &sum2[i]);
	} printf("\n");*/
	for(i=0;i<nn;i++){
		if(binary_search(sum2, sum2+nn, -1*sum1[i])){
		//해결필요	same=upper_bound(sum2, sum2+nn, -1*sum1[i])-lower_bound(sum2, sum2+nn, -1*sum1[i]);
			/*printf("%d %d  ", upper_bound(sum2, sum2+nn, -1*sum1[i]), *upper_bound(sum2, sum2+nn, -1*sum1[i]));
			printf("%d %d\n", lower_bound(sum2, sum2+nn, -1*sum1[i]), *lower_bound(sum2, sum2+nn, -1*sum1[i]));
			*/count+=same;
		}
	}
	printf("%d", count);
}
