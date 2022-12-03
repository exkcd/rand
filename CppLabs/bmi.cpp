/*
------
DISCLAIMER: PLEASE DO NOT BASE YOUR SELF WORTH OFF OF YOUR BMI. IT'S STUPID, AND HEALTH IS MORE THAN JUST WHAT YOU WEIGHT ON EARTH.
----------
*/


#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main()
{
    // Init variables used.
    double weight;
    double height;

    cout << "Welcome to the BMI calculator (please don't base your worth off this calculator)." << endl; // Initializing the calculator / welcome message

    cout << "Please enter in your weight in pounds (lbs): "; // User input for weight needed.
    cin >> weight;

    cout << "Please enter your height in inches (in): "; // User input for height needed.
    cin >> height;

    cout << "Weight is: " << weight << "lbs" << endl;
    cout << "Height is: " << height << " in" << endl;

    double bmi = (weight * 703) / (pow(height, 2)); // Calculating bmi based on user input.

    cout << "Your BMI is: " << setprecision(2) << bmi << endl; // BMI retrieved and sent.

    if (bmi >= 18.5 && bmi <= 25) // Calculating if the user is under BMI or over BMI or in a healthy range.
    {
        cout << "You're in the optimal range of healthy." << endl;
    }
    else if (bmi > 25)
    {
        cout << "Your BMI is slightly over the 'healthy' range." << endl;
    }
    else if (bmi < 18.5)
    {
        cout << "Your BMI is slightly under the 'healthy' range." << endl;
    }
}
