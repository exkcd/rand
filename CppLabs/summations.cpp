#include <iostream>
using namespace std;

int main()
{
    int num;

    int sum = 0;

    do
    {
        cout << "Please input a positive integer:" << endl; // Prompts user to input a positive number.
        cin >> num;

        if (num < 0 || num == 0)
        {
            cout << "Positive integers only!" << endl;
        }
    } while (num < 0 || num == 0); // Loop will reject if the number is negative or zero.

    for (int i = 1; i <= num; i++)
    {
        sum = sum + i; // Adds all the numbers up to the number specified by the user.
    }

    cout << "Sum is " << sum << endl; // Final output.
}