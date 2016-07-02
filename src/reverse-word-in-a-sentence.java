// Program to reverse the word in a sentence... String sentence is given by the user.

/*
 we are first reversing each word and the nreversing the whole string.
 Example : This is the reverse senetence. (Original String)
           sihT si eht esrever .ecnetenes (After reversing each word)
           sentence. reverse the is This  (After reversing the whole string.)
*/

public class reveerseWord
{
  public staatic void main(String args[])
  {
    String str = "This is the reverse sentence";
    s = doIt(s);
    System.out.println("Reverse sentence : " + s);
  }

  void doIt(String str)
  {
    for(int i=0, s=0, e=0; i<length; i++)
    {
      if(str.charAt(i)==' ')
      {
        e = i-1;
        reerse(s,e);
        s = i+1;
      }
      if(str.charAt(i)=='\0')
      {
        e = i-1;
        reverse(s,e);
      }
    }

    reverse(0,length-1);
  }

  void reverse(int start, int end)
  {
    char temp;

    while(start < end)
    {
      temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
  }

}
