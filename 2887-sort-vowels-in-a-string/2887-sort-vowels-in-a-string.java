class Solution {
    public String sortVowels(String s) {
        int len = s.length();
        List<Character> vowels = new ArrayList<>();

        // Step 1: 모음만 추출
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }

        // Step 2: 모음 정렬 (오름차순)
        Collections.sort(vowels);

        // Step 3: 문자열 다시 구성
        StringBuilder sb = new StringBuilder();
        int idx = 0; // 정렬된 모음 인덱스

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append(vowels.get(idx++)); // 정렬된 모음 사용
            } else {
                sb.append(c); // 자음은 그대로
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}