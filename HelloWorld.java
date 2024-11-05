public // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        int carry=0;
        StringBuilder S=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                if(carry==1){
                    S.append("1");
                }
                else{
                    S.append("0");
                    carry++;
                }
            }
            else{
                if(carry==1){
                    
                    int s=Integer.parseInt(Character.toString(a.charAt(i)))+Integer.parseInt(Character.toString(b.charAt(i)));
                if(s==1){
                    S.append("0");
                    carry=1;
                }
                else{
                    S.append("1");
                    carry=0;
                }
                }
                else{
                    
                    int s=Integer.parseInt(Character.toString(a.charAt(i)))+Integer.parseInt(Character.toString(b.charAt(i)));
                    System.out.println(s);
                    S.append(String.valueOf(s));
                }
            }
        }
        if(carry==1){
            S.append("1");
            System.out.println(S.toString());
        }
        System.out.println(S.toString());
    }
}
