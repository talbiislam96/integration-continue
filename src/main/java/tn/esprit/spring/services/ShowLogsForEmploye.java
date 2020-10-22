package tn.esprit.spring.services;
import org.apache.log4j.Logger;
public class ShowLogsForEmploye {
private static final Logger l = Logger.getLogger(ShowLogsForEmploye.class);
public static void main(String[] args) { ShowLogsForEmploye al = new ShowLogsForEmploye(); al.getAllEmployes(); }
public void getAllEmployes ()
{
try {
l.info("In getAllEmployes() : ");

l.debug("Satart getting Employes.");

l.debug("getting data. ");
l.debug("finished operation.");
l.info(" Got all employes  without errors.");
}
catch (Exception e) { l.error("Error: " + e); }
}
}