#include<bits/stdc++.h>

using namespace std;

void segregate(vector<int> vec, int n){
    int left = 0, right = n-1;
    while(left < right){
        while(vec[left] == 0 && left < right)
            left++;

        while(vec[right] == 1 && left < right)
            right--;
        
        if(left < right){
            // vec[left] ^= vec[right];
            // vec[right] ^= vec[left];
            // vec[left] ^= vec[right];
            vec[left] = 0;
            vec[right] = 1;

            left++;
            right--; 
        }
    }
    for(int i : vec)
        cout<<i<<" ";
}
int main(){

    vector<int> vec = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
    int n = sizeof(vec) / sizeof(vec[0]);

    segregate(vec,n);
    return 0;
}