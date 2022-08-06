class Solution {
/*

a = 2, b = 4, c = 6  # score = 0

## a=1, b = 3, c=6      score = 1       ## a=2, b=3, c=5 score=1

a=0 b = 2 c= 6          score = 2             a=2  b=2 c=4  score 2
a=0 b=1 c=5             score = 3             a=2  b=1 c=3   score 3

a=0 b=0 c=4             score = 4 ##           a=2 b = 0 c=2  score 4
                                              a=1 b =0 c=1  score 5
                                              a=0 b=0 c=0   score 6  ##

*/
    
    
public int maximumScore(int a, int b, int c) {
//maxheap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a1, b1) -> (b1 - a1));
        
        //store in maxHeap
        maxHeap.add(a);
        maxHeap.add(b);
        maxHeap.add(c);
        
        int score = 0;
        while(maxHeap.size() > 1){
            //find first two max number
            int maxNum1 = maxHeap.remove();
            int maxNum2 = maxHeap.remove();
            
            //decrement both 
            maxNum1--;
            maxNum2--;
            
            //only add in heap, if greater than 0
            if(maxNum1 > 0) maxHeap.add(maxNum1);
            if(maxNum2 > 0) maxHeap.add(maxNum2);
            
            //increase score
            score++;
        }
        
        return score;
    }
}
