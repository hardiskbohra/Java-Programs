
// word break problem.

/*
    Consider the following dictionary
    { i, like, sam, sung, samsung, mobile, ice,
      cream, icecream, man, go, mango}

    Input:  ilike
    Output: Yes
    The string can be segmented as "i like".

    Input:  ilikesamsung
    Output: Yes
    The string can be segmented as "i like samsung" or "i like sam sung".
*/

Method : The idea is simple, we consider each prefix and search it in dictionary.
         If the prefix is present in dictionary, we recur for rest of the string (or suffix).
         If the recursive call for suffix returns true, we return true, otherwise we try next prefix.
         If we have tried all prefixes and none of them resulted in a solution, we return false.


 #include <iostream>
 using namespace std;

 int dictionaryContains(string word)
 {
     string dictionary[] = {"mobile","samsung","sam","sung","man","mango",
                            "icecream","and","go","i","like","ice","cream"};
     int size = sizeof(dictionary)/sizeof(dictionary[0]);
     for (int i = 0; i < size; i++)
         if (dictionary[i].compare(word) == 0)
            return true;
     return false;
 }

 bool wordBreak(string str)
 {
     int size = str.size();

     if (size == 0)  return true;

     for (int i=1; i<=size; i++)
     {
         if (dictionaryContains( str.substr(0, i) ) &&
             wordBreak( str.substr(i, size-i) ))
             return true;
     }

     return false;
 }

 int main()
 {
     wordBreak("ilikesamsung")? cout <<"Yes\n": cout << "No\n";
     wordBreak("iiiiiiii")? cout <<"Yes\n": cout << "No\n";
     wordBreak("")? cout <<"Yes\n": cout << "No\n";
     wordBreak("ilikelikeimangoiii")? cout <<"Yes\n": cout << "No\n";
     wordBreak("samsungandmango")? cout <<"Yes\n": cout << "No\n";
     wordBreak("samsungandmangok")? cout <<"Yes\n": cout << "No\n";
     return 0;
 }
