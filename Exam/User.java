import java.util.*;

public class Userdata {
    String nameOfUser;
    String connectionsOfUser;
    int numberOfConnections;
    Userdata(String nameOfUser,String connectionsOfUser,int numberOfConnections){
        this.nameOfUser = nameOfUser;
        this.connectionsOfUser = connectionsOfUser;
        this.numberOfConnections = numberOfConnections;
    }
    public String togetnameOfUser(){
        return this.nameOfUser;
    }
    public String togetconnectionsOfUser(){
        return this.connectionsOfUser;
    }
    public int togetnumberOfConnections(){
        return this.numberOfConnections;
    }
    public void setnameOfUser(String nameOfUser){
        this.nameOfUser = nameOfUser;
    }
    public void setconnectionsOfUser(String connectionsOfUser){
        this.connectionsOfUser = connectionsOfUser;
    }
    public void setnumberOfConnections(int numberOfConnections){
        this.numberOfConnections = numberOfConnections;
    }
}
class User{
    public static void main(String[] args){
        Userdata a = new userdata();
        System.out.println(a.togetnameOfUser());
        System.out.println(a.togetconnectionsOfUser());
        System.out.println(a.togetnumberOfConnections());
    }
}