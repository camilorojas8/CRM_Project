package com.next_base_crm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"

        },
        features = "src/test/resources/features",
        glue = "com/next_base_crm/step_definitions",
        dryRun = false,
        tags = "@B29G34-291",
        publish = true // this generates a report with a public link
        //  monochrome = true

)

public class CukesRunner {}
