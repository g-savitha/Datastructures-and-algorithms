#include <iostream>
using std::cout;
using std::endl;

int fn(int n)
{
    if (n == 0)
        return;
    fn(n / 2);
    cout << n % 2 << endl;
}
int main()
{
    fn(6);
    return 0;
}
