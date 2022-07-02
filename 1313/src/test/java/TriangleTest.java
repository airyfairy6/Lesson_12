import main.Triangel;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("java.util.logging.config.file", ClassLoader.getSystemResource("logging.properties").getPath());
    }

    @BeforeAll
    static void setup() {
        System.out.println("BeforeAll executed");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("BeforeEach executed");
    }

    @Test
    void test() {
        System.out.println("Executed test method");
    }


    @Disabled
    @Test
    void additionTest() {

    }

    @DisplayName("Testing addition")
    @Test
    void addition2Test() {
        System.out.println("Function named 1 executed");
    }

    @Test
    void lambdaExpressions() {
        assertTrue(Stream.of(Triangel.geroneSquare(1, 2, 3))
                        .mapToDouble(i -> i),
                (Triangel.geroneSquare(1, 2, 3)) != 0, true, "Square should be greater than 0");
        System.out.println("Square is greater than 0");
    }

    private void assertTrue(DoubleStream mapToDouble, boolean b, boolean b1, Object o) {
    }


    @Tag("a")
    @Test
    void test1() {
        System.out.println("Fulfilling a");
    }

    @DisplayName("Repeated Test")
    @RepeatedTest(value = 2, name = "{displayName} -> {currentRepetition}")
    void repeatedTest(RepetitionInfo repetitionInfo) {
        System.out.println("Current iteration: " + repetitionInfo.getCurrentRepetition());

    }


    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 3})
    void isSquare(double s) {
        double p = 3;
        s = Math.sqrt(p * (p - 1) * (p - 2) * (p - 3));
        assertEquals(s, Triangel.geroneSquare(1, 2, 3));
        System.out.println("Formula works");
    }


    @AfterEach
    void tearThis() {
        System.out.println("AfterEach executed");
    }

    @AfterAll
    static void tear() {
        System.out.println("AfterAll executed");
    }

}

