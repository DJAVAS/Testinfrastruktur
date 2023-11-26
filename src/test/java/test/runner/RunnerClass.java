package test.runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features", // Pfad zu den Feature-Dateien
        glue = {"stepDefinitions", "Hooks"}, // Pfad zu den Step-Definitionen und Hooks
        // dryRun=false,//Feature file compile and it is true then stepdef class is executed
        tags = "@Testcase08",// specific test case @tags name are use here
        monochrome=true)
public class RunnerClass {}
