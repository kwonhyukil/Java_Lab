package Class.Lab.Bitwise;

class PermissionManager {
    // 권한 비트 위치 상수 정의
    static final int READ = 0; // 읽기 권한 비트 위치
    static final int WRITE = 1; // 쓰기 권한 비트 위치
    static final int EDIT = 2; // 수정 권한 비트 위치
    static final int DELETE = 3; // 삭제 권한 비트 위치

    private byte permissions = 0; // 초기 권한 설정은 모두 비활성호(0)

    // 권한 설정 메소드
    void setPermissions(int permission, boolean enable){
        // enable이 true인 경우:
        // - permission 위치에 있는 비트를 1로 설정 (| 연산관 << 연산 사용)
        int mask = 1 << permission;

        if (enable){ // true 일 때
            permissions |= (byte) mask; // 1로 설정
        } else { // false 일 때
            permissions &= (byte) ~mask; // 0으로 설정
        }

    }

    boolean checkPermissions(int permission){
        // permission : 확인하려는 권한 (0번째, 1번째, 2번째, 3번쨰, 비트 자리 중 하나)
        // - permission  위치 비트가 1 이면 true, 그렇지 않으면 false를 반환
        // - & 연산과 << 연산을 사용해 비트 값 확인

        int mask = 1 << permission; // 비트 확인을 위한 mask
        return (permissions & mask) != 0; // 비트가 0이 true 반환
    }

    // 모든 권한 초기화 메소드
    void removeAllPermissions(){
        // permissions 값을 0으로 설정하여 모든 비트를 0으로 만듦
        permissions = 0;
    }
}

public class OperatorLab2 {
    public static void main(String[] args) {
        PermissionManager pm = new PermissionManager();

        // 읽기, 스기, 삭제 권한 설정
        pm.setPermissions(PermissionManager.READ, true); // 읽기 권한 활성화
        pm.setPermissions(PermissionManager.WRITE, true); // 쓰기 권한 활성화
        pm.setPermissions(PermissionManager.DELETE, true); // 삭제 권한 활성화

        // 권한 확인
        System.out.println("읽기 권한: " + pm.checkPermissions(PermissionManager.READ)); // 출력: true
        System.out.println("쓰기 권한: " + pm.checkPermissions(PermissionManager.WRITE)); // 출력: true
        System.out.println("수정 권한: " + pm.checkPermissions(PermissionManager.EDIT)); // 출력: false
        System.out.println("삭제 권한: " + pm.checkPermissions(PermissionManager.DELETE)); // 출력: true

        // 권한 삭제
        pm.removeAllPermissions();
        System.out.println("읽기 권한: " + pm.checkPermissions(PermissionManager.READ)); // 출력: false
        System.out.println("읽기 권한: " + pm.checkPermissions(PermissionManager.DELETE)); // 출력: false
    }
}
