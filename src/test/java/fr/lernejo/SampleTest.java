package fr.lernejo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SampleTest {
    @Test
    void add_behaves_as_expected() {
        int result = new Sample().op(Sample.Operation.ADD, 1, 3);
        assertThat(result).isEqualTo(4);
    }
}
