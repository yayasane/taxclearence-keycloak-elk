package sn.yayaveli.taxclearancesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TaxclearancesystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxclearancesystemApplication.class, args);
	}

}
