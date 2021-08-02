#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

int main(){
	int i;
	string s;
	getline(cin, s);
	string str(s);
	vector<string> end;
	for(i=0;i<s.length();i++){
		end.push_back(s.substr(i, s.length()-i));
	}
	sort(end.begin(), end.end());
	for(i=0;i<s.length();i++){
		printf("%s\n", end[i].c_str());
	}
}
