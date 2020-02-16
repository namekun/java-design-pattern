package ch6_prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Users originUsers = new Users();
        originUsers.loadData();

        Users cloneUsers = (Users) originUsers.clone();

        List<String> origin = originUsers.getUserlist();

        for(String user : origin){
            System.out.println(user);
        }

        List<String> ex = cloneUsers.getUserlist();

        for(String user : ex){
            System.out.println(user); // clone이라 내용은 똑같다.
        }
    }
}
