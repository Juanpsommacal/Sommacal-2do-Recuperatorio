package Model;

public class Jugador {

    private String _id;
    private String guid;
    private boolean isActive;
    private String balance;
    private Integer age;
    private String eyeColor;
    private Nombre nombre;
    private String email;
    private String phone;
    private String position;

    public Jugador() {
    }

    public Jugador(String _id, String guid, boolean isActive, String balance, Integer age, String eyeColor, Nombre nombre, String email, String phone, String position) {
        this._id = _id;
        this.guid = guid;
        this.isActive = isActive;
        this.balance = balance;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "_id='" + _id + '\'' +
                ", guid='" + guid + '\'' +
                ", isActive=" + isActive +
                ", balance='" + balance + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", name=" + nombre +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setisActive(boolean active) {
        isActive = active;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Nombre getName() {
        return nombre;
    }

    public void setName(Nombre nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
