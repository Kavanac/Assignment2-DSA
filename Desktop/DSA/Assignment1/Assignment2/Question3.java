public class Question3 
{  
public static int lengthOfLHS(int[] inputArr, int len)  
{  
int ans = 0;  
for (int j = 0; j < (1l << len); j++)  
{  
    
    int minVal = Integer.MAX_VALUE;  
    int maxVal = Integer.MIN_VALUE;  
    int currLen = 0;  
  
    
    for (int k = 0; k < len; k++)  
    {  
         
        if ((j & (1 << k)) != 0)  
        {  
            currLen = currLen + 1;  
            minVal = Math.min(minVal, inputArr[k]);  
            maxVal = Math.max(maxVal, inputArr[k]);  
        }  
    }  
  
    
    if (maxVal != Integer.MIN_VALUE && minVal != Integer.MAX_VALUE && maxVal - minVal == 1)  
    {  
        ans = Math.max(ans, currLen);  
    }  
}  
  
  
return ans;  
}  
  
  
public static void main(String args[])   
{  
  
Question3 obj = new Question3();  
  
// input array  
int inputArr[] = {11, 12, 12, 13, 14, 15, 11, 11, 11, 11};  
int sze = inputArr.length; 
  
System.out.println("For the input array: ");  
for(int i = 0 ; i < sze; i++)  
{  
System.out.print(inputArr[i] + " ");  
}  
System.out.println( );  
  
int ans = obj.lengthOfLHS(inputArr, sze);  
  
System.out.println("The length of the longest Harmonic subsequence is: " + ans);  
  
System.out.println( "\n" );  
  
// input array  
int inputArr1[] = {1,3,2,2,5,2,3,7};  
sze = inputArr1.length;  
  
System.out.println("For the input array: ");  
for(int i = 0 ; i < sze; i++)  
{  
System.out.print(inputArr1[i] + " ");  
}  
System.out.println( );  
  

ans = obj.lengthOfLHS(inputArr1, sze);  
System.out.println("The length of the longest Harmonic subsequence is: " + ans);  
  
  
  
}  
}  