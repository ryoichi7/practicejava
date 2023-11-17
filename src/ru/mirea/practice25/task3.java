package ru.mirea.practice25;
import java.util.regex.Pattern;

class IPChecker {
    public static boolean check10IP(String IP){
        String pattern10ByteString = "((1\\d{2}|2([0-4]\\d|5[0-5]))|\\d|([1-9]\\d))";
        Pattern pattern10IP = Pattern.compile(getIPPattern(pattern10ByteString));
        if (pattern10IP.matcher(IP).matches()) return true;
        try {
            long iP = Long.parseLong(IP);
            System.out.println(iP);
            return iP >= 0 && iP <= Long.parseLong("4295067295");
        }
        catch (NumberFormatException numberFormatException){
            return false;
        }
    }

    private static String getIPPattern(String bytePattern){
        StringBuilder result = new StringBuilder(bytePattern);
        for(int i = 0;i<3;i++) result.append("\\.").append(bytePattern);
        return result.toString();
    }
}

class IPCheckerTester {
    public static void main(String[] args) {
        String IP1 = "192.255.255.0",IP2 = "abc.def.gha.bcd",IP3 = "3221226219",IP4 = "5221226219";
        System.out.printf("IP %1$s - %2$s\n",IP1,IPChecker.check10IP(IP1));
        System.out.printf("IP %1$s - %2$s\n",IP2,IPChecker.check10IP(IP2));
        System.out.printf("IP %1$s - %2$s\n",IP3,IPChecker.check10IP(IP3));
        System.out.printf("IP %1$s - %2$s\n",IP4,IPChecker.check10IP(IP4));
    }
}

