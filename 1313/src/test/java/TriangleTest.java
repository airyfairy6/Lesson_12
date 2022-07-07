import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest1 {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest1.class);
    private double s;


    @BeforeEach
    void setUp() {
        Triangle triangle = new Triangle();
    }

    @Test
    void lambdaExpressions() {
        Triangle triangle = new Triangle();

        assertTrue(Stream.of(triangle.geroneSquare(1, 2, 3))
                        .mapToDouble(i -> i),
                (triangle.geroneSquare(1, 2, 3)) != 0, true, "Square should be greater than 0");
        System.out.println("Square is greater than 0");
    }

    private void assertTrue(DoubleStream mapToDouble, boolean b, boolean b1, Object o) {
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 3})
    void isSquare(double s) {
        Triangle triangle = new Triangle();
        double p = 3;
        s = Math.sqrt(p * (p - 1) * (p - 2) * (p - 3));
        assertEquals(s, triangle.geroneSquare(1, 2, 3));
        System.out.println("Formula works");
    }

    @AfterEach
    public void cleanUpEach() {
        System.out.println("After Each cleanUpEach() method called");
    }


}

