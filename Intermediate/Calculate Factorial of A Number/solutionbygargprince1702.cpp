// A program to finds a Factorial of a Number
#include<iostream>
using namespace std;
int fact(int n)//Factorial function
{
	if(n==1 or n==0)
	{
		return 1; 
	}
	else
	{
	 return n*fact(n-1); 
 	 }
}
int main()
{
	int n; // Enter a Number to finds its factorial
	cout<<"Enter a number to find its factorial = ";
	cin>>n;
	int x = fact(n);
	cout<<x;
	return 0; 
}
// This code is contributed by gargprince1702
