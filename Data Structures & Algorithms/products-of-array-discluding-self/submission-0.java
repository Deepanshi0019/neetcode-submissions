class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int preffix[] = new int[n];
        preffix[0] =1;
        int suffix[] = new int[n];
        suffix[n-1] = 1;

        for(int i=1;i<n;i++){
            preffix[i] = preffix[i-1]*nums[i-1];
        } 
        for(int j= n-2;j>=0;j--){
            suffix[j] = suffix[j+1]*nums[j+1];
        }

        for(int k=0;k<n;k++){
            ans[k] = preffix[k]*suffix[k];
        }

        // for(int i=0;i<nums.length;i++){
        //     int product =1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //            product *= nums[j];
        //         }
        //     }

        //     ans[i] = product;
        // }

        return ans;
    }
}  
