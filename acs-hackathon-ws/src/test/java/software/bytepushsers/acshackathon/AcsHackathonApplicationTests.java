package software.bytepushsers.acshackathon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Profile;
import software.bytepushsers.acshackathon.domain.AmbulanceLocation;

import static org.assertj.core.api.Assertions.assertThat;

@Profile("e2e")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AcsHackathonApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		AmbulanceLocation expectedLocation = new AmbulanceLocation(1, 100.00, -300.00);
		AmbulanceLocation actualLocation = this.restTemplate.getForObject("http://localhost:" + port + "/ambulances/1", AmbulanceLocation.class);

		assertThat(actualLocation.getAmbulanceId()).isEqualTo(expectedLocation.getAmbulanceId());
		assertThat(actualLocation.getLatitude()).isEqualTo(expectedLocation.getLatitude());
		assertThat(actualLocation.getLongitude()).isEqualTo(expectedLocation.getLongitude());
	}

}
