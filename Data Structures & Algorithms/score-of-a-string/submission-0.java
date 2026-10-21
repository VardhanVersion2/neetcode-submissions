class Solution {
    public int scoreOfString(String s) {
    
    int finalSum =0;
    char c[] = s.toCharArray();
    for(int i =0; i<c.length-1 ; i++)
    {
       int sum = Math.abs(c[i]-c[i+1]);
       finalSum += sum;
    }    

    return finalSum;
       
    }
}