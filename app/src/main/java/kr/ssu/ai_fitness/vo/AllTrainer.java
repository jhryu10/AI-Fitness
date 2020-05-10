package kr.ssu.ai_fitness.vo;

public class AllTrainer {
    private int id;
    private String name;
    private String image;
    private double rating;

    public AllTrainer( String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public AllTrainer(int id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public AllTrainer(int id, String name, String image, double rating) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating = rating;
    }
}
