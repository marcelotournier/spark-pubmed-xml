/*
== PUBMED PARSER ==

Script to parse data from xml

USAGE:
spark-shell --packages com.databricks:spark-xml_2.11:0.9.0
*/

val testXML = "pubmed20n1015.xml"

val df = spark.read.
    format("com.databricks.spark.xml").
    option("rootTag", "PubmedArticleSet").
    option("rowTag", "PubmedArticle").
    load(testXML).
    cache
