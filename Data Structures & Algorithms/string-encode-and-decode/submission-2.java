class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String i:strs)
        {
            sb.append(i.length()).append("#").append(i);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        ArrayList<String> res = new ArrayList<>();
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            
            int len = Integer.parseInt(str.substring(i,j));

            String word = str.substring(j+1,j+1+len);

            res.add(word);
            i=j+1+len;

        }
        return res;
    }
}
