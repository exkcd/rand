#include <iostream>
using namespace std;
int main()
{
	int num;
	int sum;
	int avg;
	
	for (int i = 0; i < 4; i++)
	{
		cout << "Enter a number." << endl;
		cout << i + 1 << ": ";
		cin >> num;
		cout << "Number entered: " << num << endl;
		
		sum = num + sum;
	}
	
	avg = sum / 4;
	
	cout << "The sum of all the numbers entered is: " << sum << endl;
	cout << "The average of all numbers entered is: " << avg << endl;
}
