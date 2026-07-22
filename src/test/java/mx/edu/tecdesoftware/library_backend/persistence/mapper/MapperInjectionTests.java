package mx.edu.tecdesoftware.library_backend.persistence.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MapperInjectionTests {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private LoanMapper loanMapper;

    @Autowired
    private ClientMapper clientMapper;

    @Test
    void mappersAreInjected() {
        assertThat(bookMapper).isNotNull();
        assertThat(loanMapper).isNotNull();
        assertThat(clientMapper).isNotNull();
    }
}