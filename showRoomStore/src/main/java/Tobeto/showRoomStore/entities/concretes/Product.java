package Tobeto.showRoomStore.entities.concretes;
import Tobeto.showRoomStore.entities.concretes.Category;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")

public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "productName")
    private String productName;
    @Column(name = "productQuantity")
    private int productQuantity;
    @Column(name = "unitPrice")
    private double unitPrice;
    @Column(name = "imgUri")
    private String imgUri;
    @Column(name = "description")
    private String description;
    @Column(name = "isActive")
    private boolean isActive;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @JsonBackReference
    private Category category;




    public static Builder builder(){
        return new Builder();
    }

    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder {

        private int id;
        private String productName;
        private int productQuantity;
        private double unitPrice;
        private String imgUri;
        private String description;
        private boolean isActive;
        @ManyToOne
        @JoinColumn(name = "category_id", referencedColumnName = "id")
        @JsonBackReference
        private Category category;

        public Builder id(int id){
            this.id = id;

            return this;
        }
        public Builder productName(String productName){
            this.productName = productName;

            return this;
        }
        public Builder quantity(int productQuantity){
            this.productQuantity = productQuantity;

            return this;
        }
        public Builder unitPrice(double unitPrice){
            this.unitPrice = unitPrice;

            return this;
        }
        public Builder imgUri(String imgUri){
            this.imgUri = imgUri;

            return this;
        }
        public Builder description ( String description){
            this.description = description;

            return this;
        }
        public Builder isActive(boolean isActive){
            this.isActive = isActive;

            return this;
        }

        public Builder category(Category category){

            this.category = category;


            return this;
        }

        public Product build(){

            return  new Product(id,productName,productQuantity,unitPrice,imgUri,description,isActive,category);
        }
    }
}