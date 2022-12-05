package junitsuitetest.runner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import junitsuitetest.MyUtilsTest;
import junitsuitetest.packageA.TestingAStack;
 
/**
 * @SelectPackages and @SelectClasses demo
 * 
 */
@RunWith(JUnitPlatform.class)
@SelectPackages(value = { "junit.nama.junitsuitetest","junit.nama.junitsuitetest.packageA" })
//@SelectClasses( { MyUtilsTest.class, TestingAStack.class} )
public class TestSuiteWithSelectPackagesAndClassesExample {
}