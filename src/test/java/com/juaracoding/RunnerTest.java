package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {
                "src/main/resources/features/01Login.feature",
                "src/main/resources/features/02Home.feature",
                "src/main/resources/features/03MasterDepartemen.feature",
                "src/main/resources/features/04MasterGroupDokumen.feature",
                "src/main/resources/features/05MasterLokasiPenyimpanan.feature",
                "src/main/resources/features/06MasterMedia.feature",
                "src/main/resources/features/07MasterTemplate.feature",
                "src/main/resources/features/08InternalDokumen.feature",
                "src/main/resources/features/09EksternalDokumen.feature",
                "src/main/resources/features/10Perizinan.feature",
                "src/main/resources/features/11Logout.feature"
        },
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
