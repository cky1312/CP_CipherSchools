#include <bits/stdc++.h>

using namespace std;

int findCandidate(vector<int> vec)
{
    int candidateIndex = 0, count = 1;
    for (int i = 1; i < vec.size(); i++)
    {
        if (vec[i] != vec[candidateIndex])
            count--;
        else
            count++;

        if (count == 0)
        {
            candidateIndex = i;
            count = 1;
        }
    }
    return vec[candidateIndex];
}

int findMajority(vector<int> vec)
{
    int candidate = findCandidate(vec), c = 0;
    for (int i = 0; i < vec.size(); i++)
    {
        if (vec[i] == candidate)
            c++;
    }
    return c;
}

bool isMajority(vector<int> vec)
{
    int n = vec.size();
    if (findMajority(vec) > n / 2)
        return true;
    else
        return false;
}

int main()
{
    int n;
    cin >> n;
    vector<int> vec;
    for (int i = 0; i < n; i++)
    {
        int a;
        cin >> a;
        vec.push_back(a);
    }
    //vector<int> vec = {1,5,7,2,7,7,7,7};
    if (isMajority(vec))
    {
        int res = findCandidate(vec);
        cout << res;
    }
    else
        cout << "NO";
    return 0;
}