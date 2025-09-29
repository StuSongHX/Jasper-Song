class Solution {
    public int maxArea(int[] height) {
        int width=0;
        int minheight=0;
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left!=right){
            width=right-left;
            minheight=Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,computeArea(width,minheight));
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxArea;
    }
    public int computeArea(int width,int height){
        return width*height;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        Solution solution=new Solution();
        System.out.println(solution.maxArea(height));
    }
}