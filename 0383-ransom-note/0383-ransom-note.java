class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char a;
        for(int i = 0; i < ransomNote.length(); i++){
            a = ransomNote.charAt(i);
            if(magazine.contains("" + a))
                magazine = magazine.replaceFirst("" + a,"");
            else
                return false;
        }
        return true;
    }
}