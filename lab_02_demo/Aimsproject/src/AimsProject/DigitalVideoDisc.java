package AimsProject;

public class DigitalVideoDisc {
    // Các thuộc tính đã để private
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor mặc định
    public DigitalVideoDisc() {
    }

    // Constructor với title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // Constructor với category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    // Constructor với : title, category, director, length and cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

    // Constructor với  director, category, title and cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    
   
    }

    // Các  getter
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
}
