//Consonants and Vowels check - Java                                   By:Suraj yadav               17-01-2020   10:04

class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        s=s.replaceAll("\\s+","");
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'a': v=v+1;
                break;
                case 'e': v=v+1;
                break;
                case 'i': v=v+1;
                break;
                case 'o': v=v+1;
                break;
                case 'u': v=v+1;
                break;
                default: c=c+1;
                break;

            }
        }
        if(v>c)
            System.out.print("Yes");
        else if(c>v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }
}
