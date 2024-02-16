public class ArrayOps {
   
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int count=0;//count the times n appear in the array
        int n=array.length;
        for(int i=0;i<=n;i++)//contains the numbers that should appear in the array
        {
           for(int j=0;j<array.length;j++)
           {
            if(array[j]==i)
            {
                count++;
            }
           }
           if(count==0)
           {
            return i;
             
           }
           count=0;
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int index=indexofmaxvalue(array);//contains the the location of the max value
       int secmax;
         if(index==0)
         {
            secmax=array[1];
         }
         else
         {
             secmax=array[0];
         }
         for(int i=0;i<array.length;i++)
         {
            if(i!=index&&array[i]>=secmax)
            {
                secmax=array[i];
            }
         }
         
        return secmax;
    }
    public static int indexofmaxvalue(int [] arr)
    {
        int index=0;//will contain the index of the max value
        int max=arr[0];// initialize the max
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=max)
            {
              index=i;
              max=arr[i];
            }
        }
        return index;


    }
    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
         boolean inarr2=arraycontainstheother(array1, array2);
         boolean inarr1=arraycontainstheother(array2, array1);

        return (inarr1&&inarr2);
    }
    public static boolean  arraycontainstheother(int [] array1,int [] array2)
    { 
        boolean iscontain=true;
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length&&iscontain;j++)
            {
                 if(array1[i]==array2[j])
                  {
                    iscontain=false;
                  }
        
            }
          if(iscontain)
          {
            return false;
          }
          iscontain=true;
         
        }
        return iscontain;

    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
    int maxIndex=indexofmaxvalue(array);
    if(maxIndex<array.length-1&&maxIndex>0)//if the max number is not at the edges 
    {
        return false;
    }
   if(maxIndex==array.length-1)//the array suppose to increase
    {
        int j=0;
        boolean increase=true;
        for(int i=1;i<array.length&&increase;i++)
        {
               if(array[i]<array[j])
               {
                  increase=false;
               }
               j++;
               
        }
        return increase;
    }
    else
    {
        int j=0;
        boolean decrease=true;
        for(int i=1;i<array.length&&decrease;i++)
        {
               if(array[i]>array[j])
               {
                  decrease=false;
               }
               j++;
               
        }
        return decrease;
    }
       
    }
    

}
