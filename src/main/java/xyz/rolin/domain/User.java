package xyz.rolin.domain;

/**
 * @author: txl
 * DateTime: 2019/7/9 13:17
 * Description:
 */
public class User {

    private long number;
    private String name;
    private String password;
    private long mobile ;
    private long qq;
    private String email;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public long getQq() {
        return qq;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mobile=" + mobile +
                ", qq=" + qq +
                ", email='" + email + '\'' +
                '}';
    }
}