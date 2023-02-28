class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        map<int, int> map;
        
        for(int i : nums) {
            if(map[i] != 0) return true;
            else map[i]++;
        }
        
        return false;
        
    }
};