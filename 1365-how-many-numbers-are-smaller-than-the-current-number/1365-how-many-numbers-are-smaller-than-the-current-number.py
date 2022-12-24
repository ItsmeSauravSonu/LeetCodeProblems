class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        count = {}
        for i, v in enumerate(sorted(nums)):
            if v not in count:
                count[v] = i
        return [count[v] for v in nums]
        