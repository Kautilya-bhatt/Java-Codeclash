
class stringdemo {
    public static void main(String[] args) {
        String str="interview";
        for(int i=0;i<str.length();i++)
        {
            
            char a=str.charAt(i);
            if(a=='e'){
                continue;
            }
            System.out.print(a);

        }

    }    
}
