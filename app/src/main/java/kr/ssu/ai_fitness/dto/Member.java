package kr.ssu.ai_fitness.dto;

public class Member {
    private int id;
    private String email;
    private String pwd;
    private String name;
    private double height;
    private double weight;
    private byte gender;
    private String birth;
    private double muscle;
    private double fat;
    private String intro;
    private String image;
    private byte trainer;
    private byte admin;
    private byte alarm;

    public Member(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Member(int id){
        this.id=id;
    }

    public Member(int id, double height, double weight, double muscle, double fat, String intro, String image){
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.muscle = muscle;
        this.fat = fat;
        this.intro = intro;
        this.image = image;
    }

    public Member(int id, String email, String pwd, String name, double height, double weight, byte gender, String birth, double muscle, double fat, String intro, String image, byte trainer, byte admin, byte alarm) {
        this.id = id;
        this.email = email;
        this.pwd = pwd;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.birth = birth;
        this.muscle = muscle;
        this.fat = fat;
        this.intro = intro;
        this.image = image;
        this.trainer = trainer;
        this.admin = admin;
        this.alarm = alarm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setMuscle(double muscle) {
        this.muscle = muscle;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTrainer(byte trainer) {
        this.trainer = trainer;
    }

    public void setAdmin(byte admin) {
        this.admin = admin;
    }

    public void setAlarm(byte alarm) {
        this.alarm = alarm;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public byte getGender() {
        return gender;
    }

    public String getBirth() {
        return birth;
    }

    public double getMuscle() {
        return muscle;
    }

    public double getFat() {
        return fat;
    }

    public String getIntro() {
        return intro;
    }

    public String getImage() {
        return image;
    }

    public byte getTrainer() {
        return trainer;
    }

    public byte getAdmin() {
        return admin;
    }

    public byte getAlarm() {
        return alarm;
    }
}
