#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}
 
void selectionSort(int arr[], int n)
{
    int i, j, min;
 
    for (i = 0; i < n-1; i++)
    {
        min = i;
        for (j = i+1; j < n; j++)
          if (arr[j] < arr[min])
            min = j;
 
        swap(&arr[min], &arr[i]);
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
    selectionSort(arr, n);
    printf("Sorted array: \n");
   
    for (i=0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}
