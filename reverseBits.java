/*
LeetCode[190]
2025-9-29 22:30
author:Shx
 */

class Solution {
    public int reverseBits(int n) {
        int remainder=0;
        int result=0;
        ArrayList <Integer>binaryList= new ArrayList<>();
        for(int i=0;i<32;i++){
            binaryList.add(n%2);
            n=n/2;
        }
        for(int j=0;j<binaryList.size();j++){
            int bit=binaryList.get(j);
            result+=bit*(int)Math.pow(2,31-j);
        }
        return result;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution solution=new Solution();
        System.out.println(solution.reverseBits(n));
    }
}