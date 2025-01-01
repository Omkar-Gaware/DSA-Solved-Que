public class shortestpath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //North
            if (dir == 'N') {
                y++;
            }
            //South
            else if(dir == 'S'){
                y--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        int X = x*x;
        int Y = y*y;

        float sqrt = (float)Math.sqrt(X + Y);
        System.out.println(sqrt);
    }
}
