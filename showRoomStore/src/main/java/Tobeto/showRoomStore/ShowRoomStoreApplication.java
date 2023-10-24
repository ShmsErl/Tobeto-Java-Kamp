package Tobeto.showRoomStore;

import Tobeto.showRoomStore.entities.concretes.User;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ShowRoomStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowRoomStoreApplication.class, args);
	}



}
