class Solution {
    public int trap(int[] heights) {
        int size=heights.length;
        int[] maxl= new int[size];
        int[] maxr= new int[size];

        maxl[0]=heights[0];
        maxr[size-1]=heights[size-1];

        for(int i=1 ;i<size;i++){
            maxl[i]=Math.max(maxl[i-1],heights[i]);
        }

        for(int i=size-2 ;i>=0;i--){
            maxr[i]=Math.max(maxr[i+1],heights[i]);
        }

        int[] water = new int[size];
        int totalwater=0;

        for(int i=0;i<size;i++){
            water[i] = Math.min(maxl[i],maxr[i])-heights[i];
            totalwater+=water[i];
        }
        return totalwater;        
    }
}
