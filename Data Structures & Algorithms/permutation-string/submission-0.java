class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            int idx=s1.charAt(i)-'a';
            freq[idx]++;
        }
        int windSize=s1.length();

        for(int i=0;i<s2.length();i++){
            int windIdx=0;
            int idx=i;
            int[] windFreq=new int[26];

            while(windIdx<windSize && idx<s2.length()){
                windFreq[s2.charAt(idx)-'a']++;
                windIdx++;
                idx++;
            } 
            if(freqSame(windFreq,freq))return true;

        }
        return false;
    }

    private boolean freqSame(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }
}
