class Solution {
public:
    int binarySearch(vector<int>& arr, int start, int end, int target) {
        if (start > end) 
            return -1;  // base case: not found

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] < target)
            return binarySearch(arr, mid + 1, end, target);  // search right side
        else
            return binarySearch(arr, start, mid - 1, target); // search left side
    }

    int search(vector<int>& arr, int target) {
        return binarySearch(arr, 0, arr.size() - 1, target);
    }
};
