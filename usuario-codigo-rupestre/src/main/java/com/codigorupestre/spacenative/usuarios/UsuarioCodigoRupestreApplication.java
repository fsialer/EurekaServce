package com.codigorupestre.spacenative.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UsuarioCodigoRupestreApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioCodigoRupestreApplication.class, args);
	}

}
