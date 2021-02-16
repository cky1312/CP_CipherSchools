#include<bits/stdc++.h>

using namespace std;

int maxProfit(vector<int> v, int start, int end){
    if(end <= start)
        return 0;

    int profit = 0;

    for(int i = start; i < end; i++){
        for(int j = i+1; j <= end; j++){
            if(v[j] > v[i]){
                int c_profit = v[j] - v[i] + maxProfit(v,start,i-1)+maxProfit(v,j+1,end);

                profit = max(profit,c_profit);
            }
        }
    }
    return profit;
} 

int main(){
    vector<int> v = {100, 180, 260, 310, 40, 535, 695};

    int n = v.size();

    cout<<maxProfit(v,0,n-1);

    return 0;
}