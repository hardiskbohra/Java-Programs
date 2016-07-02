
// Program to reverse the word in a sentence... String sentence is given by the user.

/*
 we are first reversing each word and the nreversing the whole string.
 Example : This is the reverse senetence. (Original String)
           sihT si eht esrever .ecnetenes (After reversing each word)
           sentence. reverse the is This  (After reversing the whole string.)
*/

#include<stdio.h>

/* function to reverse a string */
void reverse(char *start, char *end);

/*Function to reverse words*/
void reversewords(char *s)
{
  char *word = s;
  char *temp = s;

  /*start reversing the individual words*/
  while( *temp )
  {
    temp++;
    if (*temp == '\0')
    {
      reverse(word, temp-1);
    }
    else if(*temp == ' ')
    {
      reverse(word, temp-1);
      word = temp+1;
    }
  }
  reverse(s, temp-1);/*Reverse the resultant string from beginning to end including spaces*/
}

/*Function to reverse a string this is similar to earlier blog post to reverse a string */
void reverse(char *start, char *end)
{
  char temp;
  while (start < end)
  {
    temp = *start;
    *start++ = *end;
    *end-- = temp;
  }
}

int main()
{
  char s[] = "This is the reverse sentence.";
  char *temp = s;
  printf("Original string: %s\n",s);
  reversewords(s);
  printf("Reverse word string: %s\n", s);
  return 0;
}
