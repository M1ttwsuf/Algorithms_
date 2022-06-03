import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* SHA-256 암호화 사용 - 단방향 암호화 방식으로 비밀번호 일치여부 확인에 쓰임*/
public class SHA256 {
    public String encrypt(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());

        return bytesToHex(md.digest());
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }
}
