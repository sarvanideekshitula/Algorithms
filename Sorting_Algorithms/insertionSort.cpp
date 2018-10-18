#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void insertionSort(int arr[], int n)
{
   int i, key, j;
   for (i = 1; i < n; i++)
   {
       key = arr[i];
       j = i-1;
 
       while (j >= 0 && arr[j] > key)
       {
           arr[j+1] = arr[j];
           j = j-1;
       }
       arr[j+1] = key;
   }
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
    insertionSort(arr, n);
    printf("Sorted array: \n");
   
    for (i=0; i < n; i++)
        printf("%d ", arr[i]);
    return 0;
}
