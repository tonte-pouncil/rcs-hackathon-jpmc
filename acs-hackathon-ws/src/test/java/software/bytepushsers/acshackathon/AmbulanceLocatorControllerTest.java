package software.bytepushsers.acshackathon;

public class AmbulanceLocatorControllerTest {
}

/**
 *
 *
 *
 *
 *
 *
 /*
 package software.bytepushsers.acshackathon;

 import org.junit.jupiter.api.Test;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
 import org.springframework.boot.test.context.SpringBootTest;
 import org.springframework.boot.test.web.client.TestRestTemplate;
 import org.springframework.boot.web.server.LocalServerPort;
 import org.springframework.test.web.servlet.MockMvc;
 import software.bytepushsers.acshackathon.domain.AmbulanceLocation;

 import static org.assertj.core.api.Assertions.assertThat;

 @SpringBootTest
 @AutoConfigureMockMvc
 class AmbulanceLocatorControllerTest {

 @Autowired
 private MockMvc mockMvc;

 @Test
 public void greetingShouldReturnDefaultMessage() throws Exception {
 AmbulanceLocation expectedLocation = new AmbulanceLocation(1, 100.00, -300.00);
 AmbulanceLocation actualLocation = this.restTemplate.getForObject("http://localhost:" + port + "/ambulances?id=1&longitude=200&latitude=-17600", AmbulanceLocation.class);

 this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
 .andExpect(content().string(containsString("Hello, World")));

 assertThat(actualLocation.getAmbulanceId()).isEqualTo(expectedLocation.getAmbulanceId());
 assertThat(actualLocation.getLatitude()).isEqualTo(expectedLocation.getLatitude());
 assertThat(actualLocation.getLongitude()).isEqualTo(expectedLocation.getLongitude());
 }

 }

 */
