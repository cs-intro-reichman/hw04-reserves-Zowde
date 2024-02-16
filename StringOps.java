import javax.lang.model.util.ElementScanner14;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
  

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        string=tolowercase(string);
        String comparison="aeiou";
        String news="";
        for(int i=0;i<string.length();i++)
        {
            if(comparison.indexOf(string.charAt(i))!=-1)
            {
                news+=(char)(string.charAt(i)-32);
            }
            else
            {
                news+=string.charAt(i);
            }
        }
;        return news;
    }
     public static String tolowercase(String word)
     {
         String mila="";
         for(int i=0;i<word.length();i++)
         {
          if(word.charAt(i)>='A'&&word.charAt(i)<='Z')
          {
            mila+=(char)(word.charAt(i)+32);

         }
         else
         {
            mila+=word.charAt(i);
         }
         }
            return mila;
     }
    public static String camelCase (String string) {
        // Write your code here:
        string =tolowercase(string);//convert the letters to lower case
        String clonestring="",word="";//clonestring-will compose the result,
       int count=0;//differentiate the first word from the others
        for(int i=0;i<string.length();i++)
        {
            while(i<string.length()&&string.charAt(i)!=' ')
            {
               word+=string.charAt(i);
               i++;
            }
            if(word!="")
            {
                if(count>0)
                word=CapThefirst(word);
                 clonestring+=word;
                count++;
            word="";
            }
        }


        return clonestring;
    }
    public static String CapThefirst(String word)//change the first letter to upper case
    {
        String cloneword=(char)(word.charAt(0)-32)+word.substring(1);
        return cloneword;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int len=0;
        String index="";
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)==chr)
            {
                 len++;
                 index+=i;
            }
        }
        int [] arr=new int[len];
        for(int i=0;i<arr.length;i++)
        {
              arr[i]=index.charAt(i)-'0';
        }

        return arr;
    }
}
