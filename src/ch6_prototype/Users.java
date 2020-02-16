package ch6_prototype;

import java.util.ArrayList;
import java.util.List;

public class Users  implements Cloneable{
    private List<String> userlist;

    public Users(List<String> userlist) {
        this.userlist = userlist;
    }

    public Users() {
        userlist = new ArrayList<>();
    }

    public void loadData(){
        userlist.add("abc");
        userlist.add("vds");
        userlist.add("cdg");
        userlist.add("hby");
    }

    public List<String> getUserlist(){
        return userlist;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List temp = new ArrayList();
        for(String s : this.getUserlist()){
            temp.add(s);
        }
        return new Users(temp);
    }
}
