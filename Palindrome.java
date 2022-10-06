public class Palindrome {
    public static void main(String[] args){
        int n=123421,m=n,rem,ans=0;
        while(n>0){
          rem=n%10;
          ans=ans*10+rem;
          n=n/10;
        }
        System.out.println(ans==m?"Palindrome":"Not Palindrome");
    }
}
