package com.student.manager.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	@Qualifier("getHostName")
	public String hostName() {

		InetAddress ip;
		String hostName = null;
		try {
			ip = InetAddress.getLocalHost();
			hostName = ip.getHostName();

		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

		return hostName;
	}
}
