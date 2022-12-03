#include <iostream>
#include <cmath>
#include <string>
using namespace std;
int main() 
{
	cout << "Enter in two numbers and I can tell you the area of the imaginary square you're giving me units for!" << endl;
	
	int side1;
	cout << "Please enter a number for the first side: ";
	cin >> side1;
	
	int side2;
	cout << "Please enter a number for the second side: ";
	cin >> side2;
	
	int area = side1 * side2;
	
	cout << "Your numbers were: " << side1 << " and " << side2 << endl;
	cout << "The area of the imaginary square is: " << area << endl;
}
