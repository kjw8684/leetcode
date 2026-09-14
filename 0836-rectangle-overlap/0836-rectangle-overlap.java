class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean side = false, hight = false;

        if(rec1[0] > rec2[0] && rec1[0] < rec2[2]) {
            side = true;
        }
        if(rec1[2] > rec2[0] && rec1[2] < rec2[2]) {
            side = true;
        }
        if(rec1[0] < rec2[0] && rec1[2] > rec2[0]) {
            side = true;
        }
        if(rec1[0] < rec2[2] && rec1[2] > rec2[2]) {
            side = true;
        }

        if(rec1[1] > rec2[1] && rec1[1] < rec2[3]) {
            hight = true;
        }
        if(rec1[3] > rec2[1] && rec1[3] < rec2[3]) {
            hight = true;
        }
        if(rec1[1] < rec2[1] && rec1[3] > rec2[1]) {
            hight = true;
        }
        if(rec1[1] < rec2[3] && rec1[3] > rec2[3]) {
            hight = true;
        }

        if(rec1[0] == rec2[0] && rec1[1] == rec2[1] && rec1[2] == rec2[2] && rec1[3] == rec2[3]) {
            return true;
        }


        return side && hight; 
    }
}