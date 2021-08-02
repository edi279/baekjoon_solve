#include <iostream>
#include <cstdio>
using namespace std;

int main(){
	int n, m, sum=0;
	int card[100];
	scanf("%d %d", &n, &m);
	for(int i=0;i<n;i++){
		scanf("%d", &card[i]);
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			for(int k=j+1;k<n;k++){
				int maxsum=card[k]+card[j]+card[i];
				if(maxsum<=m&&maxsum>sum){
					sum=maxsum;
				}
			}
		}
	}
	printf("%d\n", sum);
	return 0;
}
