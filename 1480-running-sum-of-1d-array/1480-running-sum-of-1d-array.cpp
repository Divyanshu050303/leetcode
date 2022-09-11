class Solution {
public:
    vector<int> runningSum(vector<int>& arr) {
        
        int b=0;
        for(int i=0;i< arr.size();i++){
            b=b+arr[i];
            arr[i]=b;
        }
        return arr;
    }      
};