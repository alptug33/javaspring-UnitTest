package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Test
    @Disabled("Don't run until JIRA is resolved")
    void basicTest() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        // execute method and perform assets
    }
    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        // execute method and perform assets
    }
    @Test
    @EnabledOnOs({OS.MAC,OS.WINDOWS})
    void testForMacAndWindows() {
        // execute method and perform assets
    }
    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        // execute method and perform assets
    }
    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyForJava17() {

    }
    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForOnlyForJava13() {

    }
    @Test
    @EnabledOnJre(JRE.JAVA_21)
    void testForOnlyForJava21() {

    }
    @Test
    @EnabledForJreRange(min = JRE.JAVA_13 , max = JRE.JAVA_25)
    void testForOnlyForJavaRange() {

    }
    @Test
    @EnabledOnJre(JRE.JAVA_24)
    void testForOnlyForJava24() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named="LUV2CODE_ENV",matches = "DEV")
    void testOnlyForDevEnvironment() {

    }
    @Test
    @EnabledIfSystemProperty(named="LUV2CODE_SYS_PROP",matches = "CI_CD_DEPLOY")
    void testOnlySystemProperty() {

    }

}
