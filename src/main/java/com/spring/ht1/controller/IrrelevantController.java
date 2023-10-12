package com.spring.ht1.controller;

import java.util.Collections;
import java.util.Map;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "irrelevant")
public class IrrelevantController {

	private static final Map<String, String> STATUS = Collections.singletonMap("status", "this is a irrelevant endpoint");

	@ReadOperation
	public Map<String, String> check() {
		return STATUS;
	}
}
