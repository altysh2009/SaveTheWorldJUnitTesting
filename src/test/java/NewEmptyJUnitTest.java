/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.savetheworled.Obj;
import com.mycompany.savetheworled.Solution;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Altysh
 */
@RunWith(Parameterized.class)
public class NewEmptyJUnitTest {
 int shild;
 String program;
 int caseNumer;

    public NewEmptyJUnitTest(Obj obj) {
        this.shild = obj.getShiled();
        this.program = obj.getCas();
        this.caseNumer = obj.getCasnum();
    }
    @Parameterized.Parameters
 public static List<Obj> get()
 {
     List<Obj> list = new ArrayList<Obj>();
     list.add(new Obj(1, "CS", 0));
     list.add(new Obj(2, "CS", 1));
     list.add(new Obj(1, "SS", 2));
     list.add(new Obj(6, "SCCSSC", 3));
     list.add(new Obj(2, "CC", 4));
     list.add(new Obj(3, "CSCSS", 5));
     
     return list;
 }
 @Test
 public void test()
 {
    Solution.swap(shild, program, caseNumer);
    // System.out.println(s);
 }
    
    
}
