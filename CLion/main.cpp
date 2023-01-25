#include<iostream>
using std::cin;
using std::cout;

int printBinary(int n);

const int NUMBER=2100000000;
int data[200]={0,};

int main()
{

    int n(0),ans(0);
    cin >> n;
    if(n<=NUMBER)
    {
        ans=printBinary(n);
        cout << ans;
    }
}

int printBinary(int n)
{
    if(n<=2)
    {
        return 1;
    }
    if(data[n]!=0)
    {
        return data[n]%2;
    }
    else
    {
        return data[n]%2;
    }
}

