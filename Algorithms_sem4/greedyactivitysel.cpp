#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	std::cin >> n;
	int a[n][3];
	for(int i=0;i<n;i++){
	    std::cin >> a[i][0];
	    std::cin >> a[i][1];
	    a[i][2] = i+1;
	}
	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++){
	        if(a[i][1]>a[j][1]){
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
	std::cout << 1 << std::endl;
	int j = a[0][1];
	for(int i=1;i<n;i++){
	    if(j<=a[i][0]){
	        std::cout << a[i][2] << std::endl;
	        j = a[i][1];
	    }
	}
	return 0;
}

