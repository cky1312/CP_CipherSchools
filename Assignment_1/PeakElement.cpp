#include<bits/stdc++.h>

using namespace std;

int peakElement(vector<int> vec){
    int peak;
    if(vec[0] > vec[1])
        return vec[0];

    if(vec[vec.size()-1] > vec[vec.size()-2])
        return vec[vec.size()-1];
    for(int i = 1; i < vec.size(); i++){
        if(vec[i] > vec[i-1] && vec[i] > vec[i+1])
            return vec[i];
    }
    return -1;
}

int main(){
    vector<int> vec = { 1, 3, 20, 4, 1, 0 };
    cout<<peakElement(vec);
    return 0;
}
