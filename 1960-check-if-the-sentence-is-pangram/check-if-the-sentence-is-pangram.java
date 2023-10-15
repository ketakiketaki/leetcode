class Solution {
    public boolean checkIfPangram(String sentence) {

        HashMap<Character,Integer> res = new HashMap<>();

        for(int i=0;i<sentence.length();i++)
        {
            res.put(sentence.charAt(i),1);
        }

        if(res.size()==26)
        {
            return true;
        }

        return false;
        
    }
}