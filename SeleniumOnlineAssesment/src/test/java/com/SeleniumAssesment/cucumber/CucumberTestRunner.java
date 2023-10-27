package com.SeleniumAssesment.cucumber;

public class CucumberTestRunner {
 /*
  * what is plugin option in runner file?
  * it generate different types of reports
  * such as 
  * "html:target/CucumberReport.html",
	"json:target/cucumber-report.json",
	"junit:target/cucumber-report.xml"
  *   and it has option called pretty for
  *   readability
  */
	
	/*
	 * what is glue?
	 * it is the path to the
	 * step definition for the feature file 
	 * in the runner file
	 */
	
	
	/* what is feature path in the runner file
	 * it is the path to .feature file/files
	 * 
	 */
	
	/*
	 * what is tag?
	 * it is the filter mechanism/ grouping 
	 *  to run from .feature file/files
	 *   
	 *  can you run multiple tag together and how?
	 *  yes, {"@smoke","@reg","@common"}
	 *  
	 *  what is and condition in tagging
	 *  {"@sanity" and"@common"}
	 *  
	 *  what is or condition in tagging
	 *  tags="@smoke, @sanity", //this is or condition.
	 *  
	 *  how to escape/exclude
	 *  tags="~sanity", //~ this sign will escape that scenario
	 *  {"@smoke","@reg","~@common"}
	 
	what is name taggin in the runner file
    // name= {"user name"}, // name will run from matching word from scenario line.
               //it also take regular expression. 
 
	 */
	
	/*what is snippets in the runner file
	 * cucumber has the capabilities to generate
	 * method for scenarios and provide few options
	 *   CAMELCASE==iOpenFacebookApplication
	 *   UNDERSCORE==i_open_facebook_application
	
	 */
	
	/*what is monochrome=true== good looking console
	 *what is monochrome=false== not good looking console 
	 * 
	 */
	
	/*
	 * what is dry run true== will not run
	 * without all the step definitions
	 * 
	 * * what is dry run false== will run
	 * without all the step definitions
	 * 
	 */
}
