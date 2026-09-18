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
        System.out.println("Location: " + location);
    }

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
            else if (peopleAffected <= 1000)
                severity = "High";
            else
                severity = "Extremely High";
        }

        void displayReport()
        {
            System.out.println("Incident Type: " + incidentType);
            System.out.println("People Affected: " + peopleAffected);
            System.out.println("Severity Level: " + severity);
        }
    }
}

public class Task4
{
    public static void main(String[] args)
    {
        EmergencyCenter center = new EmergencyCenter("BU Hataw 2025", "Bicol University");

        EmergencyCenter.IncidentReport report = center.new IncidentReport("Smoke Bomb Suffocation", 5000);

        center.displayCenter();

        System.out.println("\nINCIDENT REPORT");
        report.displayReport();
    }
}