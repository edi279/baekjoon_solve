#include <stdio.h>

int main(){
	int nnum, mnum=1, output=1, mnumsum=0;
	scanf("%d", &nnum);
	while(output<nnum){
		mnum=output;
		while(mnum!=0){
			mnumsum+=mnum%10;
			mnum/=10;
		}
	if(nnum==output+mnumsum) break;
	else {
		output++;
		mnumsum=0;
	}
	}
	if(output==nnum) printf("%d", 0);
	else printf("%d", output);
}
