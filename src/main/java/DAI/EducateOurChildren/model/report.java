package DAI.EducateOurChildren.model;

public class report {

    public int id_report;
    public String report;
    public int id_role;

    public report(int id_report, String report, int id_role) {
        this.id_report = id_report;
        this.report = report;
        this.id_role = id_role;
    }

    public report() {
    }


    public int getId_report() {
        return id_report;
    }

    public void setId_report(int id_report) {
        this.id_report = id_report;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
}
