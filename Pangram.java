public class Pangram {
    public static boolean checkPangram(String str)
    {
        // removing splaces and converting the input into lower case
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // checking whether the input is a panagram or not
        if(str.length()<26)
        {
            return false;
        }
        for(char ch ='a';ch<='z';ch++)
        {
            if(str.indexOf(ch)<0)
            {
                return false;
            }
        }
        return true;
    }
    
}
