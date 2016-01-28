package com.wpsnetwork.testeoJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.wpsnetwork.testeoJUnit.test.ClienteTest;
import com.wpsnetwork.testeoJUnit.test.OperacionesTest;

@RunWith(Suite.class)
@SuiteClasses({ClienteTest.class, OperacionesTest.class})
public class AllTests {

}
