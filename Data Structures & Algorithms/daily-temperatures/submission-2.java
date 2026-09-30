class Solution {
    public int[] dailyTemperatures(int[] temp) {
         
        int n =temp.length;
        int []arr=new int [temp.length];
       for(int i=0;i<n;i++){
        int l=0;
        for(int j=i+1;j<n;j++){
                l++;
                if(temp[i]<temp[j]){
                    arr[i]=j-i;
                    break;
                }
        }
         ;
       }
        return arr;
        }
    }
 
