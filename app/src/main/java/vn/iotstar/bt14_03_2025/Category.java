package vn.iotstar.bt14_03_2025;

import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("images")
    private String image;
    @SerializedName("description")
    private String description;
    public Category(int id, String name, String image, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
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

}
