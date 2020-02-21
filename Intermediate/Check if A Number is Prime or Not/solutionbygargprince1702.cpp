//A Program to check whether a Number is Prime Or Not.
#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"Enter a positive number to check Prime or Not ";
	cin>>n;
  	int flag = 0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		flag+=1;
	}
	if(flag==0)
	{
		cout<<"Yes"; //If a Given number is Prime
	}
	else
	{
		cout<<"No"; // If a Given number is not Prime
	}	
}
//This code is contributed by gargprince1702
