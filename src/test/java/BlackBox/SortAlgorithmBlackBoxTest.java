package BlackBox;

import BlackBox.Setups.SortSetup;
import org.junit.Test;

public class SortAlgorithmBlackBoxTest extends SortSetup {

    @Test
    public void dummyTest(){
        //@TODO: Delete/modify me
        int[] input = new int[]{2,1};
        int[] expectedOutput = new int[]{1,2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    //@TODO: Create more tests
    @Test
    public void test1(){
        //@TODO: Delete/modify me
        int[] input = new int[]{5,4,3,2,1};
        int[] expectedOutput = new int[]{1,2,3,4,5};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void test2(){
        //@TODO: Delete/modify me
        int[] input = new int[]{-1,27,3,4,18,9000,120000,0,-50,-2309,0,0,0,1,1,8};
        int[] expectedOutput = new int[]{-2309, -50, -1, 0, 0, 0, 0, 1, 1, 3, 4, 8, 18, 27, 9000, 120000};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void test3(){
        //@TODO: Delete/modify me
        int[] input = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 1738, -400, 64, 32, 12, -9, -2, 1886, 20000000};
        int[] expectedOutput = new int[]{Integer.MAX_VALUE, -400, -9, -2, 12, 32, 64, 1738, 1886, 20000000, Integer.MIN_VALUE};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
}
