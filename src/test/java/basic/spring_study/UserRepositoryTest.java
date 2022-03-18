package basic.spring_study;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Slf4j
public class UserRepositoryTest extends SpringStudyApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        // User 생성
        User user =
                User.builder()
                        .account("Test User 03")
                        .email("testuser03@google.com")
                        .phoneNumber("010-1234-5678")
                        .createdAt(LocalDateTime.now())
                        .createdBy("admin")
                        .build();

        // Create!
        User newUser = userRepository.save(user);

        log.info(newUser.toString());
    }
}
