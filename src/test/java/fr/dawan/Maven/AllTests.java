package fr.dawan.Maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, Calcul2Test.class, CalculTest.class })
public class AllTests {

}