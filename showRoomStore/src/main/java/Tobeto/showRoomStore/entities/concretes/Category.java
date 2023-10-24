package Tobeto.showRoomStore.entities.concretes ;

import Tobeto.showRoomStore.entities.concretes.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "categoryName")
    private String categoryName;
    @Column(name = "isActive")
    private boolean isActive;
    @OneToMany(mappedBy = "category")
    @JsonManagedReference
    private List<Product> products;

    public static Builder builder(){


        return new Builder();
    }


    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder{

        private int id;
        private String categoryName;

        private boolean isActive;
        private List<Product> categories;







        public Builder id (int id){

            this.id = id;

            return this;
        }
        public Builder categoryName(String name)
        {
            this.categoryName = name;

            return this;
        }

        public Builder active( boolean active){
            this.isActive = active;

            return this;
        }

        public Category build(){

            return  new Category(id,categoryName,isActive,categories);
        }







    }



}
