package com.test.ng.testng;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;


@SpringBootTest(classes = TestngApplication.class)
public class TestngApplicationTests extends AbstractTestNGSpringContextTests {

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void testQueryBySn() throws JSONException {
		String sn = "test-01";
		String url = "http://localhost:8080/queryBySn";

		String result = restTemplate.postForObject(url, sn, String.class);
		System.out.print(result);
	}


}
