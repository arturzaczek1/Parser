package resultFile;

import java.util.List;

public class ResultFile {

	private String dateResult;
	private String fileNameResult;
	private String attributeResult;
	private List<String> generalResult;
	private List<String> addedResult;
	private List<String> changedResult;
	private List<String> deprecatedResult;
	private List<String> removedResult;
	private List<String> fixedResult;
	private List<String> securityResult;

	public String getDateResult() {
		return dateResult;
	}
	public void setDateResult(String dateResult) {
		this.dateResult = dateResult;
	}
	public String getFileNameResult() {
		return fileNameResult;
	}
	public void setFileNameResult(String fileNameResult) {
		this.fileNameResult = fileNameResult;
	}
	public String getAttributeResult() {
		return attributeResult;
	}
	public void setAttributeResult(String attributeResult) {
		this.attributeResult = attributeResult;
	}
	public List<String> getGeneralResult() {
		return generalResult;
	}
	public void setGeneralResult(List<String> generalResult) {
		this.generalResult = generalResult;
	}
	public List<String> getAddedResult() {
		return addedResult;
	}
	public void setAddedResult(List<String> addedResult) {
		this.addedResult = addedResult;
	}
	public List<String> getChangedResult() {
		return changedResult;
	}
	public void setChangedResult(List<String> changedResult) {
		this.changedResult = changedResult;
	}
	public List<String> getDeprecatedResult() {
		return deprecatedResult;
	}
	public void setDeprecatedResult(List<String> deprecatedResult) {
		this.deprecatedResult = deprecatedResult;
	}
	public List<String> getRemovedResult() {
		return removedResult;
	}
	public void setRemovedResult(List<String> removedResult) {
		this.removedResult = removedResult;
	}
	public List<String> getFixedResult() {
		return fixedResult;
	}
	public void setFixedResult(List<String> fixedResult) {
		this.fixedResult = fixedResult;
	}
	public List<String> getSecurityResult() {
		return securityResult;
	}
	public void setSecurityResult(List<String> securityResult) {
		this.securityResult = securityResult;
	}

	@Override
	public String toString() {
		return "ResultFile [dateResult=" + dateResult + ", fileNameResult=" + fileNameResult + ", attributeResult="
				+ attributeResult + ", generalResult=" + generalResult + ", addedResult=" + addedResult
				+ ", changedResult=" + changedResult + ", deprecatedResult=" + deprecatedResult + ", removedResult="
				+ removedResult + ", fixedResult=" + fixedResult + ", securityResult=" + securityResult + "]";
	}
}
