package ch3_TemplateMethod.dp;

public abstract class AbstractGameConnectHelper {

    // 하위 클래스에서 재정의를 해야하기에 private 는 안됩니다.
    // 외부에서 호출은 막고, 하위 클래스에서 사용할 수 있도록 하는 protected 를 사용해야한다.
    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String UserName);

    protected abstract String connection(String info);

    // Template Method
    public String requestConnection(String encodedInfo) {
        // 보안 과정
        String decodedInfo = doSecurity(encodedInfo);

        // 반환된 것을 갖고, 아이디, 암호를 할당한다.
        String id = "aaa";
        String pw = "bbb";

        if (!authentication(id, pw)){
            throw new Error("아이디, 또는 비밀번호를 확인해주세요");
        }

//        String userName = "userName";
//        int permission = authorization(userName);
        String student = "student";
        int permission = authorization(student);


        switch (permission){
            case -1:
                System.out.println("Computer Shut Down because of your Age");
                break;
            case 0:
                System.out.println("Game_Manager");
                break;
            case 1:
                System.out.println("premier_User");
                break;
            case 2:
                System.out.println("norm_User");
                break;
            case 3:
                System.out.println("non-Permission");
                break;
            default:
                System.out.println("for expand");
                break;
        }


        return connection(decodedInfo);
    }
}
