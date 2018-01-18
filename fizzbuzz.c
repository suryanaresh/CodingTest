#include <stdio.h>

int main (void)
{
        int x,y;
        printf("this should count from 1 to 100, and instead of printing the multiples of 3 or 5 or 3 and 5 it should print words\n");
        for (x=1; x<=100; x++)
        {
			if (x%3==0 && x%5==0)
			{
				printf("FizzBuzz\n");
			}
			else if (x%3==0)
			{
				printf("fizz\n");
			}
			else if (x%5==0)
			{
				printf("buzz\n");
			}
			else
			{
				printf("%d\n",x);
			}
        }
return 0;
}