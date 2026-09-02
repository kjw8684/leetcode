class Solution {
    public boolean uniformArray(int[] nums1) {
        //nums1 전체 홀수, 짝수 일 시 생성가능, 짝수 - 홀수 = 홀수 임으로 모든 값이 짝수나 홀수로 통일되어있지 않을 시, 홀수 하나를 j로 설정하여 모든 짝수값에 그 홀수값을 빼주면 모두 홀수로 만들수 있다, 그러므로 false가 나오는 경우의 수는 없다.
        return true;
    }
}