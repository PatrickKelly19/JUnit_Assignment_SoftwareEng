package Car;

import org.junit.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertSame;

public class TestCar {

    Car tester = new Car();

    @Test
    public void TestYear() {
        assertEquals(0,tester.getYear());
        tester.setYear(2018);
        assertEquals(2018,tester.getYear());
        System.out.println("Year: "+tester.getYear());
    }

    @Test
    public void TestSpeed() {
        assertEquals(0,tester.getSpeed());
        tester.setSpeed(210);
        assertEquals(210,tester.getSpeed());
        System.out.println("Top Speed: "+tester.getSpeed());
    }

    @Test
    public void TestWheels() {
        assertEquals(0,tester.getWheels());
        tester.setWheels(4);
        assertEquals(4,tester.getWheels());
        System.out.println("Number of Wheels: "+tester.getWheels());
    }

    @Test
    public void TestDoors() {
        assertEquals(0,tester.getDoors());
        tester.setDoors(5);
        assertEquals(5,tester.getDoors());
        System.out.println("Number of Doors: "+tester.getDoors());
    }

    @Test
    public void TestPrice()
    {
        assertEquals(0.0,tester.getprice());
        tester.setPrice(20020.56);
        assertEquals(20020.56,tester.getprice());
        System.out.println("Price of Car: "+tester.getprice());
    }

    @Test
    public void TestKm()
    {
        assertEquals(0.0,tester.getKm());
        tester.setKm(505.49);
        assertEquals(505.49,tester.getKm());
        System.out.println("Total Km: "+tester.getKm());
    }

    @Test
    public void TestRegNo()
    {
        tester.setRegNo("162-D-12345");
        assertEquals("162-D-12345",tester.getRegNo());
        System.out.println("RegNo: "+tester.getRegNo());
        //assertNotSame(tester.getMake().length(),5);
    }

    @Test
    public void TestColour()
    {
        tester.setColour("Blue");
        assertEquals("Blue",tester.getColour());
        System.out.println("Colour: "+tester.getColour());
    }

    @Test
    public void TestFuelType()
    {
        tester.setFuelType("Petrol");
        assertEquals("Petrol",tester.getFuelType());
        System.out.println("Fuel Type: "+tester.getFuelType());
    }

    @Test
    public void TestGearBox()
    {
        tester.setGearbox("Manual");
        assertEquals("Manual",tester.getGearbox());
        System.out.println("Gearbox: "+tester.getGearbox());
    }
}

