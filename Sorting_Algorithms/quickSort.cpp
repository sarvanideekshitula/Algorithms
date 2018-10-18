
#include<stdio.h>
#include <iostream>
using namespace std;

void swap(int* a, int* b)
{
    int t = *a;
    *a = *b;
    *b = t;
}

int partition (int arr[], int low, int high){
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j <= high- 1; j++){
        if (arr[j] <= pivot)
        {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}

void quickSort(int arr[], int low, int high){
    if (low < high){
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
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
    quickSort(arr, 0,n-1);

    cout << "Sorted array is \n";
    for (i=0; i < n; i++)
		std::cout<<arr[i]<<" ";

    return 0;
}
