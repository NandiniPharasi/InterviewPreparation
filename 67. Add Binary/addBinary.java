class Solution {
    public String addBinary(String a, String b) {
        //0+0=0
        //0+1=
        //1+0
        //1+1=10
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder sb= new StringBuilder();
       
        while (i >=0 || j>=0 || carry ==1){
            int sum=carry;
            if (i >=0){
                sum+= a.charAt(i)-'0'; //ASCII number (48-49 // 48-48)
                i--;
            }
            if (j >=0){
                sum+= b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;

        }
    return sb.reverse().toString();
    }
}
