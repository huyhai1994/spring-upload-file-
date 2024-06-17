package vn.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class ProductForm {

    /*TODO:
     *   Trong lớp ProductForm vẫn có đầy đủ các
     *   thuộc tính như model Product nhưng kiểu dữ liệu
     *   của thuộc tính image sẽ đổi từ String thành
     *   MultipathFile để chứa được file khi upload.
     * */
    private int id;
    private String name;
    private String description;
    private MultipartFile image;

    public ProductForm() {
    }

    public ProductForm(int id, String name, String description, MultipartFile image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
