public class Trapping{
    public static int trappedRainWater(int height[]){  //0(n)
        int n= height.length;
        //Calculate Left max boundary - Array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //Calculate Right max boundary - Array

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        //loop 
        int TrappedWater=0;
        for(int i=0; i<n; i++){
            // water level = min(Left max , Right max)

            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // Trapped water = water level - height[i]
            TrappedWater+= waterlevel - height[i];
        }

        return TrappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};

        System.out.println(trappedRainWater(height));
    }
}