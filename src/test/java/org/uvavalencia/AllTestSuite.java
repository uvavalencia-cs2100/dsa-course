package org.uvavalencia;

import  org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, AnotherTest.class})
public class AllTestSuite {
    
}
