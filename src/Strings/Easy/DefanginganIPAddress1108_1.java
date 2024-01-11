package Strings.Easy;

//https://leetcode.com/problems/defanging-an-ip-address/description/

public class DefanginganIPAddress1108_1 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddrSB(String address) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.'){
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
