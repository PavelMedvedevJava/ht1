package com.spring.ht1;

import com.spring.ht1.entity.User;
import com.spring.ht1.repository.UserRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@SpringBootTest
@Profile("qa")
public class QADbConfigTest {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void whenCalledSave_thenCorrectNumberOfUsers() {
		userRepository.save(new User("BobQa", "bobQa@domain.com"));
		List<User> users = (List<User>) userRepository.findAll();

		assert (users.size() == 1);
	}
}
