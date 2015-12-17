import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {


    @Test
    public void lineWithSameCoordinatesLenghtsZero() {
        CartesianLine line=new CartesianLine(0,0,0,0);
        double length=line.length();
        assertEquals(0.0,length,0.0001);
}

    @Test
    public void lineWithDifferentCoordinatesLengthsOne(){
        assertEquals(1.0, new CartesianLine(0, 0, 1, 0).length(), 0.0001);
    }

    @Test
    public void lineWithCoordinatesThreeAndFourEqualsFive(){
        assertEquals(5.0, new CartesianLine(0, 0, 3, 4).length(), 0.0001);
    }


    @Test
    public void lineWithSameCoordinatesAreEqual()
    {
        CartesianLine line=new CartesianLine(1,2,3,4);
        boolean isEqual=line.isEqual(1,2,3,4);
        assertEquals(true,isEqual);
    }

    @Test
    public void lineWithDiffCoordinatesAreNotEqual() {
        CartesianLine line = new CartesianLine(1, 2, 3, 4);
        boolean isEqual = line.isEqual(5, 6, 7, 8);
        assertEquals(false, isEqual);
    }

    @Test
    public void twoLinesEqual() {
        CartesianLine line1 = new CartesianLine(1, 2, 3, 4);
        CartesianLine line2 = new CartesianLine(1, 2, 3, 4);
        boolean equal = line1.equals(line2);
        assertEquals(true, equal);
    }

    @Test
    public void twoLinesNotEqual(){
        CartesianLine line1 = new CartesianLine(1, 2, 3, 4);
        CartesianLine line2 = new CartesianLine(2, 6, 7, 8);
        assertEquals(false, line1.equals(line2));
    }

    @Test
    public void twoLinesWithReverseCoordinatesAreEqual()
    {
        CartesianLine line1 = new CartesianLine(1, 2, 3, 4);
        CartesianLine line2 = new CartesianLine(3, 4, 1, 2);
        assertEquals(true, line1.equals(line2));
    }

    @Test
    public void twoLinesWithSimilarOnePointAreNotEqual()
    {
        CartesianLine line1 = new CartesianLine(1, 2, 3, 4);
        CartesianLine line2 = new CartesianLine(3, 2, 1, 4);
        assertEquals(false, line1.equals(line2));
    }

}
