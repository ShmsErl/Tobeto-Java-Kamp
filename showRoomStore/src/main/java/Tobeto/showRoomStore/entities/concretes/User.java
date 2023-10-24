package Tobeto.showRoomStore.entities.concretes;

import jakarta.persistence.*;
import lombok.*;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder //Design Pattern
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "eMail")
    private  String eMail;
    @Column(name = "password")
    private String password;
    @Column(name = "country")
   private  String country;
    @Column(name = "age")
    private int age;
    @Column(name = "isActive")
    private  boolean isActive;
    @Column(name = "authorizationStatus" )
    private boolean authorizationStatus;






}
