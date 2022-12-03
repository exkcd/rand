/*
Name: Type name here

Date:

Version: 1.0

Description: Program asks user to input their balance, rate, and term to compound monthly interest owed.

*/
#include <iostream>
#include <cmath>
#include <iomanip> // For srounding and money purposes.

using namespace std;
int main()
{
    // Initialized variables
    double principal;
    double rate;
    double term;

    cout << "Welome to the Investment Calculator." << endl; // Welcome message

    cout << "Please type out your initial balance without the '$' sign: ";
    cin >> principal; // Getting intiital balance

    cout << "Please type out your initial rate (just type out the integer not '0.06' or '6%': ";
    cin >> rate;

    rate = rate / 1200.0; // Calculating rate

    cout << "Please type out how many years it was compounded for: ";
    cin >> term;

    term = term * 12; // Calculated term

    double monthlyPayment = (principal * rate) / (1.0 - pow(rate + 1, -term)); // Monthly payment owed.

    cout << endl;
    cout << "Amount: $" << monthlyPayment << endl; // end result
}