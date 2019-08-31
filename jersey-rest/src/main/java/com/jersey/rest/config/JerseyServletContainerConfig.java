package com.jersey.rest.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

// https://www.javaguides.net/2018/06/jersey-jax-rs-restful-crud-web-services-example.html
//Deployment of a JAX-RS application using @ApplicationPath with Servlet 3.0
//Descriptor-less deployment
@ApplicationPath("/api")
public class JerseyServletContainerConfig extends ResourceConfig {

	public JerseyServletContainerConfig() {
		packages("com.jersey.rest.controller");
	}

}
