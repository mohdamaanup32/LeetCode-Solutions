/*
Problem: 287. Find the Duplicate Number
Difficulty: Medium

Approach:
- Floyd's Tortoise and Hare (Cycle Detection)
- Treat the array as a linked list.
- Find the meeting point and then the entrance of the cycle.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
};
