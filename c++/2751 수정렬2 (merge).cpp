#include<stdio.h>
//nlogn º¹Àâµµ (merge, heap) 
void merge(int *arr, int n, int start, int mid, int end);
void mergesort(int *arr, int n, int start, int end);
int main(){
	int n, i;
	scanf("%d", &n);
	int arr[n];
	for(i=0;i<n;i++){
		scanf("%d", &arr[i]);
	}
	mergesort(arr, n, 0, n-1);
	for(i=0;i<n;i++){
		printf("%d\n", arr[i]);
	}
}
void merge(int *arr, int n, int start, int mid, int end){
	int sort[n];
	int i=start, j=mid+1, k=start;
	while(i<=mid && j<=end){
		if(arr[i]<arr[j]){
			sort[k]=arr[i];
			i++;
		}
		else{
			sort[k]=arr[j];
			j++;
		}
		k++;
	}
	if(i>mid){
		for(;j<=end;j++){
			sort[k]=arr[j];
			k++;
		}
	}
	else{
		for(;i<=mid;i++){
			sort[k]=arr[i];
			k++;
		}
	}
	for(i=start;i<=end;i++){
		arr[i]=sort[i];
	}
}
void mergesort(int *arr, int n, int start, int end){
	int mid=(start+end)/2;
	if(start<end){
		mergesort(arr, n, start, mid);
		mergesort(arr, n, mid+1, end);
		merge(arr, n, start, mid, end);
	}
}
