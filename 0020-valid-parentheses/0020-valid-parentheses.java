class Solution {
    public boolean isValid(String s)    {
        ArrayList<Character> check = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                check.add('(');
            }else if(s.charAt(i) == '{'){
                check.add('{');
            }else if(s.charAt(i) == '['){
                check.add('[');
            }else if(check.size() == 0){
                return false;
            }else if(s.charAt(i) == ')'){
                if(check.get(check.size() - 1) == '('){
                    check.remove(check.size() - 1);
                }else{return false;}
            }else if(s.charAt(i) == '}'){
                if(check.get(check.size() - 1) == '{'){
                    check.remove(check.size() - 1);
                }else{return false;}
            }else if(s.charAt(i) == ']'){
                if(check.get(check.size() - 1) == '['){
                    check.remove(check.size() - 1);
                }else{return false;}
            }
        }
        if(check.size() == 0){
            return true;
        }else{return false;}
    }
}