package main.xmlParser;

public class General {
	private Integer projectID;
	private Integer subprojectID;
	private Integer releaseID;
	private String logDate;
	public Integer getProjectID() {
		return projectID;
	}
	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
	}
	public Integer getSubprojectID() {
		return subprojectID;
	}
	public void setSubprojectID(Integer subprojectID) {
		this.subprojectID = subprojectID;
	}
	public Integer getReleaseID() {
		return releaseID;
	}
	public void setReleaseID(Integer releaseID) {
		this.releaseID = releaseID;
	}
	public String getLogDate() {
		return logDate;
	}
	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}
	@Override
	public String toString() {
		return "General [projectID=" + projectID + ", subprojectID=" + subprojectID + ", releaseID=" + releaseID
				+ ", logDate=" + logDate + "]";
	}
}
