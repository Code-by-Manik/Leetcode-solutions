class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        int size=m+n;

        int arr[size];

        for(int i=0;i<m;i++){
            
            arr[i]=nums1[i];
        }

        
        for(int i=0;i<n;i++){
            
            arr[m+i]=nums2[i];
        }


    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){

            if(arr[i]>arr[j]){
                swap(arr[i],arr[j]);
            }
        }
    }

    for(int i=0;i<size;i++){
        nums1[i]=arr[i];
    }
        
    }
};
