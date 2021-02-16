#include<bits/stdc++.h>
using namespace std;

int findMissing(vector<int> vec, int n){
    int totalSum = (n*(n+1))/2;
    // cout<<totalSum;
    int sum = 0;
    for(int i = 0; i < n - 1; i++){
        sum = sum + vec[i];
    }
    // cout<<sum;
    return totalSum - sum;
}

int main(){
    vector<int> vec = {1,2,3,4,5,6, 8, 9};
    int n = vec.size() + 1 ;

    int missingElement = findMissing(vec,n);
    cout<<missingElement;
    return 0;
}