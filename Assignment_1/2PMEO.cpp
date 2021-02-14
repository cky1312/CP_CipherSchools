#include<bits/stdc++.h>

using namespace std;

bool meetOrNot(int x1, int v1, int x2, int v2){

    if(x1 < x2 && v1 <= v2)
        return false;
    if(x1 > x2 && v1 >= v2)
        return false;

    if(x1 < x2){
        swap(x1, x2);
        swap(v1, v2);
    }

    return ((x1 - x2) % (v1 - v2) == 0);

}

int main(){

    int x1,v1,x2,v2;
    cin>>x1>>v1>>x2>>v2;
    

    if(meetOrNot(x1, v1, x2, v2))
        cout<<"YES";
    else
        cout<<"NO";

    return 0;
}
