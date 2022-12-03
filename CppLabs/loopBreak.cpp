#include <iostream>
using namespace std;
int main()
{
    for (int i = 0; i <= 10; i++)
    {
        cout << "I have said hello " << i << " times" << endl;

        if (i == 5)
        {
            cout << "I've hit the end of the road o7" << endl;
            break;
        }
    }
}