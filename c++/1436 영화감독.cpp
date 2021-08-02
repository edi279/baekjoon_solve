#include <stdio.h>
#include <math.h>
int main(){
	int n, index=0;
	int name, i;
	scanf("%d", &n);
	for(name=666;index<n;name++){
		for(i=0;i<10;i++){
			if((name/(int)pow(10,i))%1000==666) {
				index++;
				break;
			}
		}
	}
	printf("%d", --name); // for문 특성상 name++이 마지막에도 적용됨. 
}
