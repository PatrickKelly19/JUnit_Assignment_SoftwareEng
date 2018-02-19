package Calculator;

import org.junit.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static java.lang.Math.*;

public class TestCalculator {

    Calculator tester = new Calculator();
    @Test
    public void TestMultiplyByZero() {
        assertEquals(0.0, tester.getMul(0, 10));
        assertEquals(0.0, tester.getMul(10, 0));
        assertEquals(0.0, tester.getMul(0, 0));
    }

    @Test
    public void TestDivisionByZero() {
        assertEquals(0.0, tester.getDiv(10, 0));
    }

    @Test
    public void TestAdd() {
        assertEquals(tester.getAdd(3,1),4.0);
        assertEquals(tester.getAdd(-1,-4),-5.0);
        assertNotSame(4.0,tester.getAdd(-1,4.555555));
    }

    @Test
    public void TestSub() {
        assertEquals(tester.getSub(3,1),2.0);
        assertEquals(tester.getSub(-1,-4),3.0);
        assertNotSame(4.0,tester.getSub(-1,4.555555));
    }

    @Test
    public void TestMul() {
        assertEquals(tester.getMul(3,1),3.0);
        assertEquals(tester.getMul(-1,-4),4.0);
        assertNotSame(4.0,tester.getMul(-1,4.555555));
    }

    @Test
    public void TestDiv() {
        assertEquals(tester.getDiv(6,3),2.0);
        assertEquals(tester.getDiv(-1,-4),0.25);
        assertNotSame(4.0,tester.getDiv(-1,4.555555));
    }

    @Test
    public void TestSqrtRt(){
        assertEquals(tester.getSqrRt(20),4.47213595499958);
        assertNotSame(7,tester.getSqrRt(4));

        //Testing the distance between two points formula
        double distance;
        distance = pow((tester.getSqrRt(10) - tester.getSqrRt(2)),2) + pow((tester.getSqrRt(12) - tester.getSqrRt(6)),2);
        assertEquals(distance, 4.085165341523701);
    }

    @Test
    public void TestPowerOf() {
        assertEquals(tester.getPowerOf(7,5),16807.0);

        //Testing pythagoras theorem
        double pythagTheo;
        pythagTheo = tester.getPowerOf(5,2) + tester.getPowerOf(4,2);
        assertEquals(pythagTheo,41.0);

        //Testing pythagoras theorem
        double pythagTheo2;
        pythagTheo2 = tester.getPowerOf(-2,-4) + tester.getPowerOf(4,2);
        assertEquals(pythagTheo2,16.0625);
    }

    @Test
    public void TestSin() {
        assertEquals(tester.getSin(5),-0.9589242746631385);

        //Sine function
        double sine;
        sine = tester.getCos(Math.PI/2-5);
        assertEquals(sine,-0.9589242746631385);
    }

    @Test
    public void TestCos() {
        assertEquals(tester.getCos(5),0.28366218546322625);

        //Cosine function
        double cosine;
        cosine = tester.getSin(Math.PI/2-5);
        assertEquals(cosine,0.2836621854632263);
    }

    @Test
    public void TestTan() {
        assertEquals(tester.getTan(5),-3.380515006246586);

        //Tangent function
        double tangent;
        tangent = tester.getSin(4) / tester.getCos(5);
        assertEquals(tangent,-2.66797103770477545);
    }

    @Test
    public void TestSinh() {
        assertEquals(tester.getSinh(5),74.20321057778875);

        //Hyperbolic sinh
        double hypSinh;
        hypSinh = (Math.exp(5) - Math.exp(-5)) / 2;
        assertEquals(hypSinh,74.20321057778875);
    }

    @Test
    public void TestCosh() {
        assertEquals(tester.getCosh(5),74.20994852478785);

        //Hyperbolic cosh
        double hypCosh;
        hypCosh = (Math.exp(5) + Math.exp(-5)) / 2;
        assertEquals(hypCosh,74.20994852478785);
    }

    @Test
    public void TestTanh() {
        assertEquals(tester.getTanh(5),0.9999092042625951);

        //Hyperbolic tangent
        double hyptangent;
        hyptangent = tester.getSinh(5) / tester.getCosh(4);
        assertEquals(hyptangent,2.7172468838746338);
    }

    @Test
    public void TestASin() {
        assertEquals(tester.getASin(0.5),0.5235987755982989);
    }

    @Test
    public void TestACos() {
        assertEquals(tester.getACos(0.5),1.0471975511965979);
    }
    @Test
    public void TestATan() {
        assertEquals(tester.getATan(0.5),0.4636476090008061);
    }
}
