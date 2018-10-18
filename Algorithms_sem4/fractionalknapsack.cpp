#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	std::cin >> n;
	double a[n][3];
	for(int i=0;i<n;i++){
	    std::cin >> a[i][0];
	    std::cin >> a[i][1];
	    a[i][2] = a[i][1]/a[i][0];
	}
	int cap, left;
	std::cin >> cap;
	left = cap;
	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++){
	        if(a[i][2]<a[j][2]){
	            int temp1 = a[i][1];
	            a[i][1] = a[j][1];
	            a[j][1] = temp1;
	            temp1 = a[i][0];
	            a[i][0] = a[j][0];
	            a[j][0] = temp1;
	            temp1 = a[i][2];
	            a[i][2] = a[j][2];
	            a[j][2] = temp1;
	        }
	    }
	}
	int i=0, profit=0;
	while(cap>0){
	    if(a[i][0]<=cap){
	        //std::cout << "FUCK1" << std::endl;
	        cap = cap - a[i][0];
	        profit = profit + a[i][1];
	    }
	    else{
	        profit = profit + ((a[i][1]/a[i][0])*cap);
	        cap = 0;
	    }
	    i++;
	}
	std::cout << profit << std::endl;
	return 0;
}

