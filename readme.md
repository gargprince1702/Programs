# Operating System and Design and analysis of Algorithm
 This is the open repository for the programs of OS and DAA.If you want to add your programs please do it by making a separate branch.
 We will happy to merge your PR in our git repository.

## Prerequisites
Programming Language:- C
IDE :- Dev c++ ,Turbo C
Basic Knowledge of OS and DAA 

#_______________________________________________________________________________________________________________________________________

# Contribution Guidelines
- A working Program should be pushed.
- The variable name should be related to its purpose.
- The program should in indented.
- You should push the solution to the mentioned file.


# How to Make A Pull Request with your solution in the given file.
- Go to given file where you could see the problem.
- See the format of the problem and write your function accordingly. (Would help you to write a clean code.)
- Click on __create new file__
- Copy your code there and with SolutionByA.cpp [ A would be Your Name - Like SolutionBygargprince.cpp ]
- After copying, click on __propose new file__.[ At the Bottom]
- Then You'd be redirected to new page, where you need to click on __create pull request__.
- Then you can add your comments or anything you want to tell abour you solution.
- Then Click on __create pull request__.
- You have pushed your solution to the repository.

# How to Write a Program
// Example to write a clean code
  
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
 
 


 
 
