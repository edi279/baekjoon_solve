#include<stdio.h>
void swap(int *a, int *b){
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}
int main(){
	int n, i, j;
	scanf("%d", &n);
	int num[n];
	for(i=0;i<n;i++){
		scanf("%d", &num[i]);
	}
	for(i=0;i<n-1;i++){
		for(j=i+1;j<n;j++){
			if(num[i]>num[j]){
				swap(&num[i], &num[j]);
			}
		}
	}
	for(i=0;i<n;i++){
		printf("%d\n", num[i]);
	}
}
