package reports.pack;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static  void generateJvmReport(String jsonpath) {
File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReport");
Configuration con = new Configuration(f, "ADapp");
con.addClassifications("browsername", "chrome");
List<String> l = new ArrayList<String>();
l.add(jsonpath);
ReportBuilder r = new ReportBuilder(l, con);
r.generateReports();

}
}
