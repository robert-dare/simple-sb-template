package com.robertdare.tmpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.websocket.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

/**
 * POC Client application context entry point.
 *
 * @author dare (robert.dare@gmail.com)
 * @since 1.0
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(Application.class);

	protected Session session;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... args) throws Exception {
		log.info("Starting...");
	}

}