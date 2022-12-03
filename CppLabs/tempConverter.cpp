#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
	double convertFrom;
	double convertTo;
	
	cout << "Please type in the temperature (in Celsius) you would like to convert to: ";
	cin >> convertFrom;
	
	convertTo = convertFrom * 1.8 + 32;
	
	cout << fixed << setprecision(2) << convertFrom << " degrees C is " << fixed << setprecision(2) << convertTo << " degrees F." << endl;
	
	return 0;
}
