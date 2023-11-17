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
    public static boolean check8IP(String IP){
        Pattern pattern8IPPoint = Pattern.compile(getIPPattern("(0[0-3][0-7]{2})"));
        Pattern pattern8IP = Pattern.compile("0[0-3][0-7]{10}");
        return pattern8IPPoint.matcher(IP).matches() || pattern8IP.matcher(IP).matches();
    }
    public static boolean check16IP(String IP){
        Pattern pattern16IPPoint = Pattern.compile(getIPPattern("0x(\\d|A|B|C|D|E|F){2}"));
        Pattern pattern16IP = Pattern.compile( "0x(\\d|A|B|C|D|E|F){8}");
        return pattern16IPPoint.matcher(IP).matches() || pattern16IP.matcher(IP).matches();
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
        IP1 = "0300.0377.0002.0353";
        IP2 = "0307.0000.0002.0378";
        IP3 = "030000001353";
        IP4 = "030000001358";
        System.out.printf("IP %1$s - %2$s\n",IP1,IPChecker.check8IP(IP1));
        System.out.printf("IP %1$s - %2$s\n",IP2,IPChecker.check8IP(IP2));
        System.out.printf("IP %1$s - %2$s\n",IP3,IPChecker.check8IP(IP3));
        System.out.printf("IP %1$s - %2$s\n",IP4,IPChecker.check8IP(IP4));
        IP1 = "0xC0.0x00.0x02.0xEB";
        IP2 = "0xC0.0x00.0x02.0xEK";
        IP3 = "0xC00002EB";
        IP4 = "0xC00002EK";
        System.out.printf("IP %1$s - %2$s\n",IP1,IPChecker.check16IP(IP1));
        System.out.printf("IP %1$s - %2$s\n",IP2,IPChecker.check16IP(IP2));
        System.out.printf("IP %1$s - %2$s\n",IP3,IPChecker.check16IP(IP3));
        System.out.printf("IP %1$s - %2$s\n",IP4,IPChecker.check16IP(IP4));
    }
}

