package Practice;

public class _09_BitOperatorNetworkAddr {
    public static void main(String[] args) {
        // IP 주소와 서브넷 마스크를 32비트 정수로 변환
        int ip = (192 << 24) | (168 << 16) | (1 << 8) | 10; // IP 주소: 192.168.1.10
        // 192 : 2진수 표현
        // 00000000 00000000 00000000 11000000
        // 192 << 24
        // 11000000 00000000 00000000 00000000
        // 168 : 2진수 표현
        // 00000000 00000000 00000000 10101000
        // 168 << 16
        // 00000000 10101000 00000000 00000000
        // 1 : 2진수 표현
        // 00000000 00000000 00000000 00000001
        // 1 << 8
        // 00000000 00000000 00000001 00000000
        // 10 : 2진수 표현
        // 00000000 00000000 00000000 00001010
        int subnetMask = (255 << 24) | (255 << 16) | (255 << 8) | 0; // 서브넷 마스크: 255.255.255.0

        // 네트워크 주소 계산 ( IP 주소와 서브넷 마스크의 AND 연산 )
        int networkAddress = ip & subnetMask;

        // 결과 출력
        System.out.println("IP Address: " + ipToString(ip));
        System.out.println("Subnet Mask: " + ipToString(subnetMask));
        System.out.println("Network Address: " + ipToString(networkAddress));
    }
    // 32비트 정수형 IP 주소를 문자열 형태로 변환하는 함수
    public static String ipToString (int ip) {
        return ((ip >> 24) & 0xFF) + "." + ((ip >> 16) & 0xFF) + "." + ((ip >> 8) & 0xFF) + "." + (ip & 0xFF);
    }
}
