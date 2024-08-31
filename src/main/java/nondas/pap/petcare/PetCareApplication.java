package nondas.pap.petcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication()
public class PetCareApplication {

	public static void main(String[] args) throws UnknownHostException {


		System.out.println("\n\n\n IP  " + InetAddress.getLocalHost());

		SpringApplication.run(PetCareApplication.class, args);
	}

}
