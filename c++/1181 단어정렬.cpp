#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;
bool check(const string &s1, const string &s2){
	if(s1.length()==s2.length()){
		return s1<s2;
	}
	else return s1.length()<s2.length();
}
int main(){
	int n, i;
	char word[50];
	scanf("%d", &n);
	vector<string> wd;
	for(i=0;i<n;i++){
		scanf("%s", word);
		string str(word);
		wd.push_back(str);
	}
	sort(wd.begin(), wd.end(), check);
	wd.erase(unique(wd.begin(), wd.end()), wd.end());
	for(i=0;i<wd.size();i++){
		printf("%s\n", wd[i].c_str());
	}	
}
