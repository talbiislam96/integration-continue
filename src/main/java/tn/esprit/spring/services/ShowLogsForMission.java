package tn.esprit.spring.services;
import org.apache.log4j.Logger;
public class ShowLogsForMission {
private static final Logger l = Logger.getLogger(ShowLogsForMission.class);
public static void main(String[] args) { ShowLogsForMission al = new ShowLogsForMission(); al.findAllMissionByEmployeJPQL(); }
public void findAllMissionByEmployeJPQL ()
{
try {
l.info("In findAllMissionByEmployeJPQL() : ");

l.debug("Start getting Missions.");

l.debug("getting data. ");
l.debug("finished operation.");
l.info(" Got all missions without errors.");
}
catch (Exception e) { l.error("Error: " + e); }
}
}