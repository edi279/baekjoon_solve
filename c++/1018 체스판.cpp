#include <stdio.h>

int main(){
	int n, m;
	scanf("%d %d", &n, &m);
	int i, j, x, y;
	int minc, count=n*m/2;
	char board[50][50];
	for(i=0;i<n;i++){
		scanf("%s", &board[i]); // 왜 2차원 %c로 받으면 에러나지? 
	}
	for(i=0;i<n-7;i++){
		for(j=0;j<m-7;j++){
			int bcount=0, wcount=0;
			for(x=i;x<i+8;x++){
				for(y=j;y<j+8;y++){
					if((x+y)%2!=0){
						if(board[x][y]=='B') bcount++; //나중에 b가 더 많으면 w로 바꾸는 쪽이 유리. 
						else wcount++;
					}
					else {
						if(board[x][y]=='B') wcount++;
						else bcount++;
					}
				}
			}
			minc=bcount<wcount?bcount:wcount;
			if(count>(minc)){
				count=minc;
			}
		}
	}
	printf("%d", count);
}
