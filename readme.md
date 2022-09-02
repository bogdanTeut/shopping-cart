Considerations:

Prerequisites:
* Scala 2: 
  For mac: brew install coursier/formulas/coursier && cs setup
  For other operating systems: https://docs.scala-lang.org/getting-started/index.html
* Sbt:
  For mac: brew install coursier/formulas/coursier && cs setup
  For other operating systems: https://www.scala-sbt.org/download.html

Observations:
* Instead of modeling products as strings maybe different solutions were more appropriate: enums, sealed classes
* Further, refactoring is necessary. 
* Further validation/tests are required, e.g when elements are empty string or blank.
* From TDD pov, the commit where I introduced offers logic also contains switching from Double to BigDecimal. 
It could have been broken into smaller steps/tests one for each: 
 1) products with offer
 2) products without offer 
 3) rounding issues
But this would have taken more time.
* I used scala 2 as this is the version I am familiar with but scala 3 looks much better :) 

