#include<iostream>
using namespace std;

void constructMatrix(int arr[],int n){
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i<=j){
				cout<<arr[i*n-i*(i+1)/2+j]<<" ";
			}else{
				cout<<arr[j*n-j*(j+1)/2+i]<<" ";
			}
		}
		cout<<endl;
	}
}
int main(){
	cout<<"Enter the number of elements in the symmetic matrix\n";
	int n;
	cin>>n;
	int arr[(n*(n+1))/2];
	for(int i=0;i<(n*(n+1))/2;i++){
		cin>>arr[i];
	}
	constructMatrix(arr,n);

}