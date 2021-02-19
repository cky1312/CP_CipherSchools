#include <bits/stdc++.h>
using namespace std;

void nextGreaterElement(vector<int> &arr)
{
    vector<int> result;
    stack<int> S;
    int N = arr.size();

    S.push(arr[0]);

    for (int i = 1; i < N; i++)
    {
        if (S.empty())
        {
            S.push(arr[i]);
            continue;
        }

        while (S.empty() == false && S.top() < arr[i])
        {
            cout << S.top() << " => " << arr[i] << endl;
            S.pop();
        }

        S.push(arr[i]);
    }

    while (S.empty() == false)
    {
        cout << S.top() << "=>" << -1 << endl;
        S.pop();
    }
}

int main()
{
    int n;
    cout<<"Enter the length of the vector";
    cin>>n;

    cout<<"Enter the element in the vector";
    vector<int> v;

    for(int i = 0; i < n; i++){
        int a;
        cin>>a;
        v.push_back(a);
    }

    nextGreaterElement(v);
}