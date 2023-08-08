class Solution {
    String[][] Key = {{"a","b","c"},
        {"d","e","f"},
        {"g","h","i"},
        {"j","k","l"},
        {"m","n","o"},
        {"p","q","r","s"},
        {"t","u","v"},
        {"w","x","y","z"}
    };
    List<String> Result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {   
        if(digits.equals("")){
            return Result;
        }
        select(digits,"");
        return Result;
    }
    public int select(String digits, String answer){
        if(digits.equals("")){
            Result.add(answer);
            return 0;
        }
        for(int i = 0; i < Key[(int)digits.charAt(0) - '0' - 2].length; i++){    
            select(digits.replaceFirst(Character.toString(digits.charAt(0)), ""),answer + Key[(int)digits.charAt(0) - '0' - 2][i]);
        }
        return 0;
    }
}