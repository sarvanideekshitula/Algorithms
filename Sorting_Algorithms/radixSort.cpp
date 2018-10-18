#include<iostream>
#include <bits/stdc++.h>
using namespace std;
void countSort(int arr[], int n, int exp)
{
    int output[n];
    int i, count[10] = {0};

    for (i = 0; i < n; i++)
        count[ (arr[i]/exp)%10 ]++;

    for (i = 1; i < 10; i++)
        count[i] += count[i - 1];

    for (i = n - 1; i >= 0; i--){
        output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
        count[ (arr[i]/exp)%10 ]--;
    }

    for (i = 0; i < n; i++)
        arr[i] = output[i];
}

void radixsort(int arr[], int n){
  int m = arr[0];
  for (int i = 1; i < n; i++)
      if (arr[i] > m)
          m = arr[i];

    for (int exp = 1; m/exp > 0; exp *= 10)
        countSort(arr, n, exp);
}

int main()
{
    int n;
	std::cin>>n;
	int i,arr[n];
	for(i=0;i<n;i++)
	{
		std::cin>>arr[i];
	}
    radixsort(arr, n);
    printf("Sorted array: \n");

    for (i=0; i < n; i++)
        printf("%d ", arr[i]);
    return 0;
}
