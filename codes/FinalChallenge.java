abstract class Responder
{
    abstract void respond();
}

class RescueResponder extends Responder
{
    int peopleNeedingRescue;
    int peopleRescued;

    RescueResponder() // Constructor 1: No reported people needing rescue
    {
        peopleNeedingRescue = 0;
        peopleRescued = 0;
    }

    RescueResponder(int peopleNeedingRescue) // Constructor 2: There are reported people needing rescue
    {
        this.peopleNeedingRescue = peopleNeedingRescue;
        this.peopleRescued = 0;
    }

    @Override
    void respond()
    {
        System.out.println("[1] RESCUE RESPONSE");
        System.out.println("People Needing Rescue: " + peopleNeedingRescue);

        if (peopleNeedingRescue > 0)
        {
            peopleRescued = peopleNeedingRescue;
            peopleNeedingRescue = 0;

            System.out.println("Action: The Rescue Responders are rescuing people who fainted during the event.");
        }
        else
            System.out.println("Action: The Rescue Responders are on standby because no one currently needs rescue.");
    }

    int getPeopleRescued()
    {
        return peopleRescued;
    }
}

class LogisticsResponder extends Responder
{
    int peopleWaitingForTransport;
    int peopleTransported;
    String transportMethod;
    String destination;

    LogisticsResponder(String transportMethod)
    {
        this.transportMethod = transportMethod;
        this.destination = "BU University Health Office";
        this.peopleWaitingForTransport = 0;
        this.peopleTransported = 0;
    }

    void receiveRescuedPeople(int peopleRescued)
    {
        peopleWaitingForTransport = peopleRescued;
    }

    @Override
    void respond()
    {
        System.out.println("\n[2] LOGISTICS RESPONSE");
        System.out.println("Transport Method: " + transportMethod);
        System.out.println("Destination: " + destination);
        System.out.println("People Waiting for Transport: " + peopleWaitingForTransport);

        if (peopleWaitingForTransport > 0)
        {
            peopleTransported = peopleWaitingForTransport;
            peopleWaitingForTransport = 0;

            System.out.println("Action: The Logistics Responders are transporting the rescued people to the " + destination + ".");
        }
        else
            System.out.println("Action: The Logistics Responders are on standby because no rescued person is waiting for transport.");
    }

    int getPeopleTransported()
    {
        return peopleTransported;
    }
}

class MedicalResponder extends Responder
{
    String station;
    int patientsWaiting;
    int patientsTreated;

    MedicalResponder()
    {
        station = "BU University Health Office";
        patientsWaiting = 0;
        patientsTreated = 0;
    }

    void receivePatients(int peopleTransported)
    {
        patientsWaiting = peopleTransported;
    }

    @Override
    void respond()
    {
        System.out.println("\n[3] MEDICAL RESPONSE");
        System.out.println("Station: " + station);
        System.out.println("Patients Waiting for Treatment: " + patientsWaiting);

        if (patientsWaiting > 0)
        {
            patientsTreated = patientsWaiting;
            patientsWaiting = 0;

            System.out.println("Action: The Medical Responders are providing medical attention to the transported patients.");
        }
        else
            System.out.println("Action: The Medical Responders are on standby because no patient has arrived.");
    }

    int getPatientsTreated()
    {
        return patientsTreated;
    }
}

class EmergencyCenter
{
    String event;
    String location;

    EmergencyCenter(String event, String location)
    {
        this.event = event;
        this.location = location;
    }

    void displayCenter()
    {
        System.out.println("Event: " + event);
        System.out.println("Location: " + location + "\n");
    }

    // Non-static inner class
    class IncidentReport
    {
        String incidentType;
        String severity;
        int peopleAffected;

        IncidentReport(String incidentType, int peopleAffected)
        {
            this.incidentType = incidentType;
            this.peopleAffected = peopleAffected;

            if (peopleAffected <= 10)
                severity = "Low";
            else if (peopleAffected <= 100)
                severity = "Medium";
            else
                severity = "High";
        }

        void displayReport()
        {
            System.out.println("Incident Type: " + incidentType);
            System.out.println("Severity Level: " + severity);
            System.out.println("People Affected: " + peopleAffected + "\n");
        }
    }
}

public class FinalChallenge
{
    public static void main(String[] args)
    {
        EmergencyCenter center = new EmergencyCenter("BU Hataw 2025", "Bicol University");
        EmergencyCenter.IncidentReport report = center.new IncidentReport("Smoke Bomb Suffocation", 100);

        System.out.println("EMERGENCY INCIDENT");
        center.displayCenter();

        System.out.println("INCIDENT REPORT");
        report.displayReport();

        RescueResponder standbyRescue = new RescueResponder(); // Demonstrate the first overloaded constructor. No student needing rescue

        System.out.println("CONSTRUCTOR OVERLOADING DEMONSTRATION");
        standbyRescue.respond();

        RescueResponder rescue = new RescueResponder(100); // Demonstrate the second overloaded constructor

        LogisticsResponder logistics = new LogisticsResponder("Stretcher");

        MedicalResponder medical = new MedicalResponder();
        
        Responder[] responders = {rescue, logistics, medical}; // Store responder objects using the common Responder type

        System.out.println("\nEMERGENCY RESPONSE\n");
        
        responders[0].respond(); // STEP 1: Rescue

        logistics.receiveRescuedPeople(rescue.getPeopleRescued()); // Pass rescued people to Logistics

        responders[1].respond(); // STEP 2: Logistics

        medical.receivePatients(logistics.getPeopleTransported()); // Pass transported people to Medical

        responders[2].respond(); // STEP 3: Medical

        System.out.println("\nFINAL INCIDENT REPORT");
        System.out.println("----------------------------------------");
        System.out.printf("%-28s %s%n", "Response Stage", "Total");
        System.out.println("----------------------------------------");
        System.out.printf("%-28s %d%n", "People Rescued", rescue.getPeopleRescued());
        System.out.printf("%-28s %d%n", "People Transported", logistics.getPeopleTransported());
        System.out.printf("%-28s %d%n", "Patients Treated", medical.getPatientsTreated());
        System.out.println("----------------------------------------");
    }
}