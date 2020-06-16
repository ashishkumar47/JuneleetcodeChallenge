package leetcodechallenge;

public class ValidateIPAddress {
    public static String validIPAddress(String IP) {
        if(IP==null||IP.length()==0)
            return "Neither";
        if(IP.contains("."))
            return checkForIPV4(IP);
        if(IP.contains(":"))
            return checkForIPV6(IP);
        return "Neither";
    }
    public static String checkForIPV4(String str){
        if(str.charAt(0)=='.'||str.charAt(str.length()-1)=='.')
            return "Neither";
        String[] fragments=str.split("\\.");
        if(fragments.length!=4)
            return "Neither";
        for(String fragment:fragments){
            if(fragment.length()==0||fragment.length()>3||(fragment.charAt(0)=='0'&&fragment.length()>1))
                return "Neither";
            for(int i=0;i<fragment.length();i++){
                if(fragment.charAt(i)<'0'||fragment.charAt(i)>'9')
                    return "Neither";
            }
            if(Integer.valueOf(fragment)>255)
                return "Neither";
        }
        return "IPv4";
    }
    public static String checkForIPV6(String str){
        if(str.charAt(str.length()-1)==':')
            return "Neither";
        String[] fragments=str.split(":");
        if(fragments.length!=8)
            return "Neither";
        for(String fragment:fragments){
            if(fragment.length()==0||fragment.length()>4)
                return "Neither";
            for(int i=0;i<fragment.length();i++){
                char ch=fragment.charAt(i);
                if(!(ch>='0'&&ch<='9')&&!(ch>='a'&&ch<='f')&&!(ch>='A'&&ch<='F'))
                    return "Neither";
            }
        }
        return "IPv6";
    }
    public static void main(String[] args) {

    }
}
