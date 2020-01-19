package ch3_TemplateMethod.dp;

public class DefaultGameConnection extends AbstractGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
//        System.out.println("decoding!");
        System.out.println("using enhanced decoding algorithm!");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("authentication!");
        return true; // if correct, return true
    }

    @Override
    protected int authorization(String UserName) {
        System.out.println("permission authorization!");
        // 서버에서 유저 이름, 나이를 알 수 있다.
        // 나이를 확인하고, 시간을 확인해서 미성년자, 그리고 저녁 10시가 지났다면
        // 바로 권한을 없는 것으로 처리해준다.
        if(UserName == "student"){
            return -1;
        }
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("the last connection phase!");
        return info;
    }
}
